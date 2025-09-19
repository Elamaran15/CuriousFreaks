package org.code.coreJava.generics;

public class MathGeneric<T> {


    private T first;
    private T second;

    public void addFirst(T element){
        this.first=element;
    }

    public void addSecond(T element){
        this.second=element;
    }

    public T getFirst(){
        return  first;
    }

    public T getSecond(){
        return second;
    }

}
