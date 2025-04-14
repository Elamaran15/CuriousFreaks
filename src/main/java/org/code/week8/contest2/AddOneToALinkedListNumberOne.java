package org.code.week8.contest2;

import java.util.Scanner;
/*
Add 1 to a Linked List Number 1
Problem
Submissions
Leaderboard
Discussions
You are given a linked list where each element in the list is a node and have an integer data.
 You need to add 1 to the number formed by concatinating all the list node numbers together and return the head of the modified linked list.

Lets assume the node is 4->5->6 so it is 456 + 1 = 457, so 457 is the expected output.

Input Format

n = 3 -> Number of nodes LinkedList: 4 5 6

Constraints

1 <= len(list) <= 105

Output Format

457

Sample Input 0

3
4 5 6
Sample Output 0

457
Sample Input 1

1
2
Sample Output 1

3
 */
public class AddOneToALinkedListNumberOne {

    static class Node {
        char data;
        AddOneToALinkedListNumberOne.Node next;

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
        AddOneToALinkedListNumberOne.Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            char ch = in.next().charAt(0);
            AddOneToALinkedListNumberOne.Node newNode = new AddOneToALinkedListNumberOne.Node(ch);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }


        StringBuilder ans= new StringBuilder();

        Node temp=head;

        while(temp!=null){
            ans.append(temp.data);
            temp=temp.next;
        }

        System.out.println(Integer.parseInt(ans.toString()) + 1);



    }
}
