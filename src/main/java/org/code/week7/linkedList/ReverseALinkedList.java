package org.code.week7.linkedList;


import static org.code.week7.linkedList.SingleLinkedList.addNodeAtLast;

/*
Reverse a linked list
Difficulty: EasyAccuracy: 73.11%Submissions: 341K+Points: 2Average Time: 30m
Given the head of a linked list, the task is to reverse this list and return the reversed head.

Examples:

Input: head: 1 -> 2 -> 3 -> 4 -> NULL
Output: head: 4 -> 3 -> 2 -> 1 -> NULL
Explanation:

Input: head: 2 -> 7 -> 10 -> 9 -> 8 -> NULL
Output: head: 8 -> 9 -> 10 -> 7 -> 2 -> NULL
Explanation:

Input: head: 2 -> NULL
Output: 2 -> NULL
Explanation:

https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1?page=1

 */
public class ReverseALinkedList {

    static Node reverseList(Node head) {
        Node previousTemp=null;

        while(head!=null){
            Node front=head.next;
            head.next=previousTemp;
            previousTemp=head;
            head=front;
        }

        head=previousTemp;
        return head;
    }


    public static void main(String[] args) {
        Node head=null;
        head=addNodeAtLast(10,head);
        head=addNodeAtLast(20,head);
        head=addNodeAtLast(30,head);
        head=addNodeAtLast(40,head);
        head=addNodeAtLast(50,head);
        System.out.println(head);
        System.out.println("***********");
        head=reverseList(head);
        System.out.println(head);
    }
}
