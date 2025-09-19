package org.code.coreJava.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MainTest {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz=Class.forName("UserInfo.class");

        Object obj=clazz.getDeclaredConstructor().newInstance();

        // Access private field
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
       String name = field.getName();
    }
}
