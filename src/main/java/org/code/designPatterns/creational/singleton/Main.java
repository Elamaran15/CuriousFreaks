package org.code.designPatterns.creational.singleton;

public class Main {
    static LazySingleton lazySingleton1;
    static LazySingleton lazySingleton2;

    public static void main(String[] args) {
        EagerSingleton eagerSingleton=EagerSingleton.getInstance();
        System.out.println(eagerSingleton);


        EagerSingleton eagerSingleton1=EagerSingleton.getInstance();
        System.out.println(eagerSingleton1);

        System.out.println("****************************");
        Thread t1 = new Thread(() -> lazySingleton1 = LazySingleton.getInstance());
        Thread t2 = new Thread(() -> lazySingleton2 = LazySingleton.getInstance());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Instance from Thread 1: " + lazySingleton1);
        System.out.println("Instance from Thread 2: " + lazySingleton2);
        System.out.println("Are both instances the same? " + (lazySingleton1 == lazySingleton2));


        System.out.println("****************************");
        SynchronizedMethodSingleton singleton=SynchronizedMethodSingleton.getInstance();
        System.out.println(singleton);

        System.out.println("****************************");

        SynchronizedBlockSingleton synchronizedBlockSingleton=SynchronizedBlockSingleton.getInstance();
        SynchronizedBlockSingleton synchronizedBlockSingleton1=SynchronizedBlockSingleton.getInstance();
        System.out.println(synchronizedBlockSingleton);
        System.out.println(synchronizedBlockSingleton1);

        System.out.println("****************************");
        DoubleCheckSingleton doubleCheckSingleton=DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton1=DoubleCheckSingleton.getInstance();

        System.out.println(doubleCheckSingleton);
        System.out.println(doubleCheckSingleton1);
    }
}
