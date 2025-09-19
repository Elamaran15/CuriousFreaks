package org.code.coreJava.funtionalPrograming;

public class Main {

    public static void main(String[] args) {
        CustomFunctional c = (s1,s2) -> {
            return s1+s2;
        };
        System.out.println(c.concat("ela","reo"));
    }
}
