package org.code.week7.linkedList;


/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).


https://leetcode.com/problems/linked-list-cycle/description/
 */
public class LinkedListCycle {


    public static boolean hasCycle(Node head) {
      Node slow=head;
      Node fast=head;

      while(fast.next!=null && fast.next.next!=null && slow!=null){
          slow=slow.next;
          fast=fast.next.next;

          if(slow==fast)
              return true;
      }

      return false;
    }


    public static void main(String[] args) {
        Node head=new Node(1);
//        head.next=new Node(2);
//        head.next.next=head;
//        head.next.next.next=new Node(4);
//        head.next.next.next.next=new Node(5);
        System.out.println(hasCycle(head));
    }
}
