package org.code.week7.linkedList;

public class MergeTwoSortedLinkedLists {


    // Helper to build linked list from array
    static Node buildList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    static Node sortedMerge(Node head1, Node head2) {
        Node temp1=head1;
        Node temp2=head2;
        
        Node nowNodeTemp=null;
        Node newNodeHead=null;
        
        while(temp1!=null && temp2!=null){
            Node node;
            if(temp1.data<=temp2.data){
                node = new Node(temp1.data);
                temp1=temp1.next;
            }else{
                node = new Node(temp2.data);
                temp2=temp2.next;
            }
            if(newNodeHead==null){
                newNodeHead=node;
                nowNodeTemp=node;
            }else{
                nowNodeTemp.next=node;
                nowNodeTemp=node;
            }
        }

        while(temp1!=null){
            Node node=new Node(temp1.data);
            nowNodeTemp.next=node;
            nowNodeTemp=node;
            temp1=temp1.next;
        }


        while(temp2!=null){
            Node node=new Node(temp2.data);
            nowNodeTemp.next=node;
            nowNodeTemp=node;
            temp2=temp2.next;
        }

        return newNodeHead;
    } 


    public static void main(String[] args) {
        // Example input
        int[] arr1 = {1,1};
        int[] arr2 = {2,4};

        Node head1 = buildList(arr1);
        Node head2 = buildList(arr2);


        Node SortedNode=sortedMerge(head1,head2);
        System.out.println(SortedNode);

    }
}
