package org.code.week7.linkedList;

public class LinkedListGroupReverse {


    public static Node reverseKGroup(Node head, int k) {
        if(head==null || head.next==null || k <= 1)
            return head;


        Node temp=head;
        int count=1;

        while(count!=k && temp!=null){
            temp=temp.next;
            count++;
        }

        // If fewer than k nodes, reverse all and return
        if (temp == null) {
            return reverse(head, null);
        }

        Node secondNodeHead=temp.next;
        Node firstReverseNode=reverse(head,temp);
        Node secondRervseNode=reverse(secondNodeHead,null);
        Node tempFirst=firstReverseNode;
        while(tempFirst.next!=null){
            tempFirst=tempFirst.next;
        }

        tempFirst.next=secondRervseNode;
        return firstReverseNode;
    }


    static Node reverse(Node head,Node temp){
        Node previousNode=null;

        do{
            Node front=head.next;
            head.next=previousNode;
            previousNode=head;
            head=front;
        }while(previousNode!=temp && head!=null);

        return previousNode;
    }


    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(7);
        head.next.next = new Node(1);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next.next.next.next = new Node(8);
        Node node=reverseKGroup(head,3);
        System.out.println(node);
    }
}
