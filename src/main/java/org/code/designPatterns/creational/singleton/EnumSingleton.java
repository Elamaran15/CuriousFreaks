package org.code.designPatterns.creational.singleton;

public enum EnumSingleton {

    INSTANCE;

    public static String getInstance(){
        return "In enum singleton";
    }
}
