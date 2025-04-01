package org.code.designPatterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/*
Use enum if possible (most secure).

Use constructor check + readResolve() for class-based Singleton.
 */
public class BreakSingleton {

    static void breakUsingSerialization() throws IOException, ClassNotFoundException {
        LazySingleton singleton=LazySingleton.getInstance();

        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("Object.obj"));
        obj.writeObject(singleton);
        obj.flush();
        obj.close();

        ObjectInputStream objIn=new ObjectInputStream(new FileInputStream("Object.obj"));
        LazySingleton lazy=(LazySingleton) objIn.readObject();

        System.out.println("Object one Hashcode:"+singleton.hashCode());
        System.out.println("Object Two HashCode:"+lazy.hashCode());
    }


    /*
     Preventing Singleton Breakage by Reflection
      Solution 1: Throw an Exception in Constructor if Instance Exists
     */

    static void breakUsingReflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingleton lazySingleton1=LazySingleton.getInstance();

        Constructor<LazySingleton> reflectionObject=LazySingleton.class.getDeclaredConstructor();
        reflectionObject.setAccessible(true);

        LazySingleton lazySingleton2=reflectionObject.newInstance();

        System.out.println("Object one Hashcode:"+lazySingleton1.hashCode());
        System.out.println("Object Two HashCode:"+lazySingleton2.hashCode());
    }


    public static void main(String[] args) {


    }
}
