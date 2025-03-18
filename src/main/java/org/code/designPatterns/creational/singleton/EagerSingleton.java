package org.code.designPatterns.creational.singleton;

/*
In this approach, the instance is created at the time of class loading, even if it is never used.

✅ Pros:
✔ Thread-safe (JVM loads the instance only once).
✔ Fast execution (since it's pre-created).

❌ Cons:
✖ Wastes memory if the instance is never used
*/
public class EagerSingleton {

    private final static EagerSingleton INSTANCE=new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
