package org.code.week7.linkedList;

import static org.code.week7.linkedList.SingleLinkedList.addNodeAtLast;

public class IdenticalLinkedLists {

    public static boolean areIdentical(Node head1, Node head2) {
       Node temp1=head1;
       Node temp2=head2;
       while(temp1!=null && temp2!=null){
           if(temp1.data!=temp2.data)
               return false;


          temp1=temp1.next;
          temp2=temp2.next;
       }
       return true;
    }


    public static void main(String[] args) {
        Node head=null;
        head=addNodeAtLast(10,head);
        head=addNodeAtLast(20,head);
        head=addNodeAtLast(40,head);
        head=addNodeAtLast(50,head);

        Node head2=null;
        head2=addNodeAtLast(10,head2);
        head2=addNodeAtLast(20,head2);
        head2=addNodeAtLast(30,head2);
        head2=addNodeAtLast(50,head2);

        System.out.println(areIdentical(head,head2));

    }
}
