package org.code.week7.linkedList;


import static org.code.week7.linkedList.SingleLinkedList.addNodeAtLast;

/*
Insert in a Sorted List
Difficulty: EasyAccuracy: 31.37%Submissions: 137K+Points: 2Average Time: 20m
Given a linked list sorted in ascending order and an integer called key, insert data in the linked list such that the list remains sorted.

Examples:

Input: LinkedList: 25->36->47->58->69->80, key: 19
Output: 19->25->36->47->58->69->80

Explanation: After inserting 19 the sorted linked list will look like the one in the output.
Input: LinkedList: 50->100, key: 75
Output: 50->75->100

Explanation: After inserting 75 the sorted linked list will look like the one in the output.



 */
public class InsertInASortedList {

    static Node sortedInsert(Node head, int key) {
        Node node=new Node(key);
        Node temp=head;
        Node previousTemp=null;

        while(temp!=null){
            if(key<temp.data){
                node.next=temp;
                if(previousTemp!=null) {
                    previousTemp.next = node;
                }else{
                    head=node;
                }
                return head;
            }else{
                previousTemp=temp;
                temp=temp.next;
            }
        }

        if(previousTemp.data<=key){
            previousTemp.next=node;
        }

        return head;
    }


    public static void main(String[] args) {
//        Node head=null;
//        head=addNodeAtLast(10,head);
//        head=addNodeAtLast(20,head);
//        head=addNodeAtLast(30,head);
//        head=addNodeAtLast(40,head);
//        head=addNodeAtLast(50,head);
//        System.out.println(head);
//        head= sortedInsert(head,11);
//        System.out.println(head);

        Node head = null;

        int[] numbers = {
                17, 18, 22, 44, 56, 66, 74, 81, 89, 91, 92, 94, 97, 102, 107, 109, 111, 117,
                124, 130, 143, 143, 144, 156, 163, 168, 173, 173, 175, 190, 190, 199, 204,
                206, 212, 212, 218, 237, 242, 248, 251, 256, 257, 264, 266, 282, 283, 284,
                291, 301, 302, 309, 311, 314, 318, 339, 347, 351, 352, 354, 355, 362, 369,
                373, 379, 386, 387, 398, 402, 408, 409, 421, 423, 431, 441, 442, 449, 450,
                453, 458, 472, 474, 493, 500, 506, 511, 514, 526, 530, 534, 543, 546, 551,
                579, 582, 585, 586, 589, 598, 604, 624, 634, 642, 646, 647, 648, 649, 650,
                650, 651, 655, 670, 679, 697, 703, 703, 708, 710, 725, 727, 731, 743, 771,
                773, 779, 780, 783, 791, 799, 801, 807, 811, 812, 819, 821, 823, 825, 828,
                829, 830, 831, 837, 841, 842, 864, 866, 866, 867, 877, 894, 895, 901, 917,
                926, 928, 941, 951, 954, 965, 966, 967, 976, 982, 983, 995, 999
        };

        for (int num : numbers) {
            head = addNodeAtLast(num, head);
        }



        System.out.println(head);
        sortedInsert(head,999);
        System.out.println(head);
    }
}
