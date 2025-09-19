package org.code.coreJava.thread;

public class Main {

    public static void main(String[] args) {
        Thread extendThread=new Thread(new ExtendThread());
        extendThread.start();

        Thread implementRunnable =new Thread(new ImplementRunnable());
        implementRunnable.start();

        //Using lamda expression
        Thread lamdaExpression= new Thread(()-> System.out.println("In lamdaExpression run() method"));
        lamdaExpression.start();
    }
}
