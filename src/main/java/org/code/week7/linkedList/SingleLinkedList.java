package org.code.week7.linkedList;

public class SingleLinkedList {


    static void setPosition(int position, int data, Node head){
        int count=1;
        Node temp=head;
        while(temp!=null){
            if(count==position){
                temp.data=data;
            }
            temp=temp.next;
            count++;
        }
    }

    static Node addNodeAtLast(int data,Node head){
        Node node=new Node(data);
        if(head==null){
           return node;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        return head;
    }


    public static void main(String[] args) {
        Node head=null;
        head=addNodeAtLast(10,head);
        System.out.println(head);
        head=addNodeAtLast(20,head);
        System.out.println(head);
        head=addNodeAtLast(30,head);
        System.out.println(head);
        setPosition(3,35,head);
        System.out.println(head);
        head=deletePosition(1,head);
        System.out.println(head);
        head=insertBeforeGivinNode(head,2,25);
        System.out.println(head);
        head=insertBeforeGivinNode(head,3,28);
        System.out.println(head);
        head=deletePosition(1,head);
        System.out.println(head);

    }

    private static Node deletePosition(int position,Node head) {
        int count=1;
        Node temp=head;
        while(temp!=null){
            if(position==1){
              head=head.next;
              return head;
            }
            if(count==position-1){
                temp.next=temp.next.next;
            }
            temp=temp.next;
            count++;
        }

        return head;
    }


    static void printAllValues(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }


    public int getCount(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }


    static Node insertBeforeGivinNode(Node head,int position,int data){
        Node node=new Node(data);
        Node temp=head;
        int count=1;
        while(temp!=null){
            if(count==position-1){
                node.next=temp.next;
                temp.next=node;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }

    static void deleteNodeWithOutHead(Node node) {
        Node temp=node.next;
        node.data=temp.data;
        node.next=temp.next;
    }


}
