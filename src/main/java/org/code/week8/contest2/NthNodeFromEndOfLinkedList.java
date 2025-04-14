package org.code.week8.contest2;

import org.code.week8.contest1.VowelsLL;

import java.util.Scanner;
/*
Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list. If n is beyond the total number of nodes then return -1.

Note: Create the linked list provided the numbers.

Input Format

N = 9

K = 2

LinkedList: 1->2->3->4->5->6->7->8->9

There are 9 nodes in linked list and we need to find 2nd node from end. 2nd node from end is 8.

Constraints

1 <= L <= 106

1 <= N <= 106

Output Format

8

Sample Input 0

4 5
10 5 100 5
Sample Output 0

-1
Sample Input 1

6 3
89 78 9 0 67 92
Sample Output 1

0
 */
public class NthNodeFromEndOfLinkedList {

    static class Node {
        char data;
        NthNodeFromEndOfLinkedList.Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k= in.nextInt();
        NthNodeFromEndOfLinkedList.Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            char ch = in.next().charAt(0);
            NthNodeFromEndOfLinkedList.Node newNode = new NthNodeFromEndOfLinkedList.Node(ch);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        if(n<k){
            System.out.println(-1);
            return;
        }
        Node temp=head;
        int ans=n-k;
        for(int i=0;i<ans;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}
