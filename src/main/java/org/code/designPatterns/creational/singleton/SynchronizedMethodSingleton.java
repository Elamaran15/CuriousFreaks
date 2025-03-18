package org.code.designPatterns.creational.singleton;


/*
✅ Pros:
✔ Thread-safe
✔ Lazy initialization
❌ Cons:
✖ Slow performance (synchronization adds overhead on every call).


🔴 Problem: Even after the instance is created, synchronization adds unnecessary overhead.
 */
public class SynchronizedMethodSingleton {

    private static SynchronizedMethodSingleton INSTANCE;

    private SynchronizedMethodSingleton(){}

    public static synchronized SynchronizedMethodSingleton getInstance(){
        if(INSTANCE==null)
            INSTANCE=new SynchronizedMethodSingleton();

        return INSTANCE;
    }
}
