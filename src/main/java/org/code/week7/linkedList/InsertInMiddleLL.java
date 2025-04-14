package org.code.week7.linkedList;

import static org.code.week7.linkedList.SingleLinkedList.addNodeAtLast;

/*
Insert in Middle of Linked List
Difficulty: BasicAccuracy: 43.2%Submissions: 124K+Points: 1Average Time: 20m
Given the head of a Singly Linked List and a value x. The task is to insert the key in the middle of the linked list.

Examples :

Input: LinkedList = 1->2->4 , x = 3
Output: 1->2->3->4
Explanation:

The new element is inserted after the current middle element in the linked list.


Input: LinkedList = 10->20->40->50 , x = 30
Output: 10->20->30->40->50
 */
public class InsertInMiddleLL {

    public static Node insertInMiddle(Node head, int x) {
        Node node =new Node(x);
        if(head==null){
            return node;
        }
        Node MidNode=getMiddleNode(head);
        node.next=MidNode.next;
        MidNode.next=node;
        return head;
    }

    private static Node getMiddleNode(Node temp) {
        Node slow=temp;
        Node fast=temp;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }


    public static void main(String[] args) {
        Node head=null;

        head=addNodeAtLast(10,head);
        System.out.println(head);
        head=addNodeAtLast(20,head);
        System.out.println(head);
        head=addNodeAtLast(40,head);
        System.out.println(head);
        head=addNodeAtLast(50,head);
        System.out.println(head);

        insertInMiddle(head, 30);
        System.out.println(head);
    }
}
