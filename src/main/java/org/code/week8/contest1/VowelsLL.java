package org.code.week8.contest1;

import java.util.Scanner;

/*
Arrange Consonants and Vowels
Problem
Submissions
Leaderboard
Discussions
Given a singly linked list of size N containing only English Alphabets
.Your task is to complete the function, that arranges the consonants and
vowel nodes of the list it in such a way that all the vowels nodes
come before the consonants while maintaining the order of their arrival.

Input Format

6

a e g h i m

Constraints

1 <= T <= 100

1 <= N <= 100

Output Format

a e i g h m

Sample Input 0

6
a e g h i m
Sample Output 0

a e i g h m
Sample Input 1

3
q r t
Sample Output 1

q r t


 */
public class VowelsLL {

    public static class Node {
        char data;
        Node next;

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
        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            char ch = in.next().charAt(0);
            Node newNode = new Node(ch);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }


        Node temp=head;
        Node prevTemp=null;
        Node vowel=null;

        while(temp!=null){
            if(isVowel(temp.data)){
                if(vowel==null && prevTemp==null){
                    prevTemp=temp;
                    vowel=temp;
                    temp=temp.next;
                }else if(vowel==null && prevTemp!=null){
                    Node nodeNew=new Node(temp.data);
                    nodeNew.next=prevTemp;
                    vowel=nodeNew;
                    prevTemp.next=prevTemp.next.next;
                    temp=prevTemp.next;
                }else{
                    Node nodeNew=new Node(temp.data);
                    nodeNew.next=vowel.next;
                    vowel.next=nodeNew;
                    vowel=nodeNew;
                    prevTemp.next=prevTemp.next.next;
                    temp=prevTemp.next;
                }
            }else {
                prevTemp = temp;
                temp = temp.next;
            }
        }

        System.out.println(head);

    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


}
