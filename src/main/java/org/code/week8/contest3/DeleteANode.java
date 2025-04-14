package org.code.week8.contest3;

import org.code.week8.contest2.AddOneToALinkedListNumberOne;

import java.util.Scanner;

public class DeleteANode {

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        SinglyLinkedListNode temp=llist;
        if(position==0){
           return null;
        }


        int count=0;
        while(count!=position-1){
            temp=temp.next;
            count++;
        }

        temp.next=temp.next.next;
        return llist;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SinglyLinkedListNode head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int c = in.nextInt();
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(c);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int position=in.nextInt();
        System.out.println(head);
        System.out.println("********************************************");
        SinglyLinkedListNode  newHead=deleteNode(head,position);
        System.out.println(newHead);
    }
}
