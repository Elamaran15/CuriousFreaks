package org.code.week7.linkedList;

import static org.code.week7.linkedList.MergeTwoSortedLinkedLists.buildList;

/*

2095. Delete the Middle Node of a Linked List
Medium
Topics
Companies
Hint
You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.


Example 1:


Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node.
Example 2:


Input: head = [1,2,3,4]
Output: [1,2,4]
Explanation:
The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.



 */
public class DeleteMiddleNodeLinkedList {

    public static Node deleteMiddle(Node head) {
        if( head==null || head.next==null)
            return head;

        Node middleNode=getMiddleNode(head);

        Node temp=head;
        while(temp!=null && temp.next!=middleNode){
            temp=temp.next;
        }

        temp.next=temp.next.next;


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



    static Node delete(Node head){

        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        int mid=size/2;

        int count=0;
        Node temp1=head;
        while(count!=mid-1){
            temp1=temp1.next;
            count++;
        }

        temp1.next=temp1.next.next;
        return head;
    }


    public static void main(String[] args) {
        int[] arr1 = {2,1};

        Node head1 = buildList(arr1);
        head1=delete(head1);
        System.out.println(head1);

    }


}
