package org.code.week7.linkedList;

import static org.code.week7.linkedList.SingleLinkedList.addNodeAtLast;

public class MiddleLinkedList {

    static int getMiddle(Node head) {
      int count=0;
      Node temp=head;
      while(temp!=null){
          count++;
          temp=temp.next;
      }
      int mid=count/2 +1;

      Node temp2=head;
      for(int i=1;i<mid;i++){
          temp2=temp2.next;
      }
      return temp2.data;

    }



    static int getMiddleUsingSlowAndFast(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;
    }


    public static void main(String[] args) {
        Node head=null;
        head=addNodeAtLast(10,head);
        System.out.println(head);
        head=addNodeAtLast(20,head);
        System.out.println(head);
        head=addNodeAtLast(30,head);
        System.out.println(head);
        head=addNodeAtLast(40,head);
        System.out.println(head);
        head=addNodeAtLast(50,head);
        System.out.println(head);
        int mid=getMiddleUsingSlowAndFast(head);
        System.out.println(mid);


    }
}
