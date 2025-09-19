package org.code.designPatterns.creational.singleton;


/*
Inner class loads only when needed.

Thread-safe, lazy, and no synchronization overhead.

Best practice in Java.
 */
public class BillPughSingleton {


    private BillPughSingleton(){}

    private static class InnerBillPughSingleton{
        private static final BillPughSingleton INSTANCE=new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return InnerBillPughSingleton.INSTANCE;
    }
}
