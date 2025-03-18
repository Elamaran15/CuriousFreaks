package org.code.designPatterns.creational.prototype;

public class Student implements Prototype{

    public String name;
    public int std;
    private int rollNo;

    public Student(String name, int std, int rollNo) {
        this.name = name;
        this.std = std;
        this.rollNo = rollNo;
    }

    @Override
    public Prototype clone() {
        return new Student(name,std,rollNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", std=" + std +
                ", rollNo=" + rollNo +
                '}';
    }
}
