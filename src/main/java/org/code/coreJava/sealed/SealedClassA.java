package org.code.coreJava.sealed;

public sealed  class SealedClassA extends ClassE implements InterfaceF permits ClassB{

    public int a=10;

    public int getA(){
        return a;
    }

    @Override
    public void skip() {
        System.out.println("Skip....");
    }
}
