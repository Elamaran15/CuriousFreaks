package org.code.week9.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Practice {


    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("*************");

        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        Queue<Integer> queue1=new LinkedList<>();
        queue1.add(queue.remove());
        queue1.add(queue.remove());
        queue1.add(queue.remove());
        queue1.add(queue.remove());
        queue1.add(queue.remove());

        System.out.println(queue1.remove());
    }

}
