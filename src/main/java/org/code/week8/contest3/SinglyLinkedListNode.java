package org.code.week8.contest3;

public class SinglyLinkedListNode {

    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    @Override
    public String toString() {
        return "SinglyLinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
