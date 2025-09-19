package org.code.coreJava.innerClass;

public class StaticInnerClass {

    private String name="Elamaran";
    private static String userName="Reo";


    static class InnerClass{

        void print(){
            System.out.println("UserName: "+userName);
        }
    }
}
