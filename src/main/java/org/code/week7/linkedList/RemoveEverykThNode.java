package org.code.week7.linkedList;

import static org.code.week7.linkedList.SingleLinkedList.addNodeAtLast;

/*
Remove every k'th node
Given a singly linked list, your task is to remove every kth node from the linked list.

Examples:

Input: Linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8, k = 2
Output: 1 -> 3 -> 5 -> 7

Explanation: After removing every 2nd node of the linked list, the resultant linked list will be: 1 -> 3 -> 5 -> 7.
Input: Linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10, k = 3
Output: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10

Explanation: After removing every 3rd node of the linked list, the resultant linked list will be: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10.

https://www.geeksforgeeks.org/problems/remove-every-kth-node/1
 */
public class RemoveEverykThNode {

   static Node deleteK(Node head, int k) {
        Node temp=head;
        int size=1;
        Node previousTemp=null;
        while(temp!=null){

            if(k==1){
                head=temp.next;
                return head;
            }

            if(size%k==0){
                temp=temp.next;
                previousTemp.next=temp;
            }else{
                previousTemp=temp;
                temp=temp.next;
            }
            size++;
        }

        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=addNodeAtLast(10,head);
        head=addNodeAtLast(20,head);
        head=addNodeAtLast(30,head);
        head=addNodeAtLast(40,head);
        head=addNodeAtLast(50,head);
        head=addNodeAtLast(60,head);
        head=addNodeAtLast(70,head);
        head=addNodeAtLast(80,head);
        head=addNodeAtLast(90,head);
        head=addNodeAtLast(100,head);
        System.out.println(head);

        head=deleteK(head,1);
        System.out.println(head);




    }

}
