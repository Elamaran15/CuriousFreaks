package org.code.coreJava.innerClass;

public class LocalInnerClass {



    void display(){
        String localMessage = "Hello from Local Inner Class";

        // Local inner class
        class Inner {
            void print() {
                System.out.println(localMessage);
            }
        }

        Inner inner = new Inner(); // create object inside the method
        inner.print();
    }
}
