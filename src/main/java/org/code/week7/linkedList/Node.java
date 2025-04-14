package org.code.week7.linkedList;

public class Node {

     int data;
     Node next;

     public Node(int data,Node node){
         this.data=data;
         this.next=node;
     }


     public Node(int data){
         this.data=data;
         this.next=null;
     }

     public Node(){

     }


    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

