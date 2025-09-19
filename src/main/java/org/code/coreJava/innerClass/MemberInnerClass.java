package org.code.coreJava.innerClass;



/*
Non-static Inner Class (Member Inner Class)

1.Defined inside a class, but not static.

2.Can access all members (even private ones) of the outer class.

3.Needs an object of outer class to create it.


 */
public class MemberInnerClass {

    private String name = "Elamaran";

    private static String userName = "Reo";

    class InnerMember {

        void printName() {
            System.out.println("Name from class: " + name);
            System.out.println("Static name: " + userName);
        }
    }
}


