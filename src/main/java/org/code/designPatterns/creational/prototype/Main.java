package org.code.designPatterns.creational.prototype;

public class Main {


    public static void main(String[] args) {
        Student obj1=new Student("Elamaran",8,1234);
        Student obj2=(Student) obj1.clone();

        obj1.setName("ELAMARAN");

        System.out.println(obj2);
        System.out.println(obj1);

    }
}
