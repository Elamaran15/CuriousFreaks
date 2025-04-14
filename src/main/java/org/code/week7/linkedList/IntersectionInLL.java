package org.code.week7.linkedList;

public class IntersectionInLL {

    static Node intersectPoint(Node head1, Node head2) {
        Node temp1=head1;
        Node temp2=head2;

        int count1=getSize(temp1);
        int count2=getSize(temp2);

        if(count1>count2){
            return getNode(count1-count2, temp1, temp2,true);
        }else{
            return getNode(count2-count1,temp1,temp2,false);
        }


    }

    private static Node getNode(int moveCount, Node temp1, Node temp2,boolean firstNodeBig) {

        while(moveCount!=0){
            if(firstNodeBig) {
                temp1 = temp1.next;
            }else{
                temp2= temp2.next;
            }
            moveCount--;
        }

        while(temp1 !=null && temp2 !=null){
            if(temp1 == temp2)
                return temp1;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }

    private static int getSize(Node head) {
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        // Create common list after intersection: 30 -> 40 -> 50
        Node common = new Node(8);
        common.next = new Node(4);
        common.next.next = new Node(5);

        // First list: 10 -> 20 -> 30 -> 40 -> 50
        Node head1 = new Node(4);
        head1.next = new Node(1);
        head1.next.next = common;

        // Second list: 15 -> 30 -> 40 -> 50 (starts at 15, joins at 30)
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(1);
        head2.next.next.next = common;

        Node interection=intersectPoint(head1,head2);
        System.out.println(interection);

    }
}
