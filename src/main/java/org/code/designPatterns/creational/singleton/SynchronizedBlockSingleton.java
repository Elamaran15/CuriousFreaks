package org.code.designPatterns.creational.singleton;


/*
Instead of synchronizing the entire method, we synchronize only the critical section.
✅ Pros:
✔ Thread-safe
✔ Better performance than synchronized method
❌ Cons:
✖ Still some performance overhead due to synchronization.
*/
public class SynchronizedBlockSingleton {

    private static SynchronizedBlockSingleton INSTANCE;

    private SynchronizedBlockSingleton(){}

    public static SynchronizedBlockSingleton getInstance(){
        if(INSTANCE==null){
            synchronized (SynchronizedBlockSingleton.class){
                if (INSTANCE==null){
                    INSTANCE=new SynchronizedBlockSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
