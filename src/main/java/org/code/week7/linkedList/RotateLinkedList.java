package org.code.week7.linkedList;


import static org.code.week7.linkedList.SingleLinkedList.addNodeAtLast;
import static org.code.week7.linkedList.SingleLinkedList.setPosition;

/*
Rotate a Linked List
Difficulty: MediumAccuracy: 39.95%Submissions: 287K+Points: 4Average Time: 30m
Given the head of a singly linked list, your task is to left rotate the linked list k times.

Examples:

Input: head = 10 -> 20 -> 30 -> 40 -> 50, k = 4
Output: 50 -> 10 -> 20 -> 30 -> 40
Explanation:
Rotate 1: 20 -> 30 -> 40 -> 50 -> 10
Rotate 2: 30 -> 40 -> 50 -> 10 -> 20
Rotate 3: 40 -> 50 -> 10 -> 20 -> 30
Rotate 4: 50 -> 10 -> 20 -> 30 -> 40



https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1
 */
public class RotateLinkedList {

    public static Node rotate(Node head, int k) {
        Node tail=head;
        int size=1;

        while(tail.next!=null){
            size++;
            tail=tail.next;
        }

        if(k%size==0)
            return head;

        tail.next=head;
        k=k%size;

        //Now move the tail to the n-k position to make it as new tail for rotated LL
        int i=size-k;
        while(i>0){
           tail=tail.next;
           i--;
       }

       head=tail.next;

       tail.next=null;

        return head;
    }


    public static void main(String[] args) {
        Node head=null;
        head=addNodeAtLast(10,head);
        head=addNodeAtLast(20,head);
        head=addNodeAtLast(30,head);
        head=addNodeAtLast(40,head);;
        head=addNodeAtLast(50,head);
        System.out.println(head);
        head=rotate(head,7);
        System.out.println(head);



    }
}
