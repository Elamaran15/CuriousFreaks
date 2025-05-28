package org.code.week9.stack;

import java.util.Arrays;

public class CustomStack {

   protected int[] data=null;
   private static final int DEFAULT_SIZE=10;
   private static int ptr=-1;

   public CustomStack(){
       this(DEFAULT_SIZE);
   }

   public CustomStack(int size){
         data = new int[size];
   }


   public void push(int n){
       if(isFull()){
           System.out.println("Stack is full");
           return;
       }
       ptr++;
       data[ptr]=n;
   }

   public int pop(){
       if(isEmpty()){
           System.out.println("Stack is Empty");
           return -1;
       }

       int removedN=data[ptr];
       ptr--;
       return removedN;
   }

    private boolean isEmpty() {
       return ptr==-1;
   }

    private boolean isFull() {
       return ptr== data.length-1;
    }



    public void printStack(){
        Arrays.stream(data).forEach(System.out::print);
    }
}
