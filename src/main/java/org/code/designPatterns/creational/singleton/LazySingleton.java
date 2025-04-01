package org.code.designPatterns.creational.singleton;


/*
In this approach, the instance is created only when it is needed.
✅ Pros:
✔ Saves memory by creating the instance only when required.
❌ Cons:
✖ Not thread-safe (two threads might create separate instances simultaneously).

Problem: If two threads call getInstance() simultaneously when instance is null,
 two instances may be created.
 */


import java.io.Serial;
import java.io.Serializable;

public class LazySingleton  implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static LazySingleton INSTANCE;

    private LazySingleton(){
        if(INSTANCE!=null){
            throw new IllegalStateException("Singleton object already exist");
        }
    }

    public static LazySingleton getInstance(){
        if(INSTANCE==null){
            try {
                //for testing made this thread to sleep
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            INSTANCE= new LazySingleton();
        }
        return INSTANCE;
    }

    //Override readResolve to return the same instance
    protected Object readResolve() {
        return getInstance(); // Ensures Singleton during deserialization
    }
}
