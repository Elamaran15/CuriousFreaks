package org.code.coreJava.thread.deadLock;

import com.sun.source.doctree.ThrowsTree;

public class DeadLock {
   public static final Object lock1 =new Object();
   public static final Object lock2=new Object();


    public static void main(String[] args) {

        Runnable task1= () -> {
            synchronized (lock1){
                System.out.println("In First step task1 : "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                    System.out.println("In second step task1 after sleep : "+Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock2){
                    System.out.println("In Third step task1 lock2 : "+ Thread.currentThread().getName());
                }
            }


        };


        Runnable task2= () -> {
            synchronized (lock2){
                System.out.println("In first step task2 lock2 : "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                    System.out.println("In second step task2 lock2 after sleep : "+Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock1){
                    System.out.println("In third step task2 : "+Thread.currentThread().getName());
                }
            }
        };

        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        t1.start();
        t2.start();

    }
}
