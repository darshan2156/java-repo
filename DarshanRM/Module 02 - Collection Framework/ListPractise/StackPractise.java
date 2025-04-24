package org.darshan.CollectionsPractise.CollectionFramework.ListPractise;

import java.util.Stack;

public class StackPractise {
    public static void main(String[] args) {
        // "First in and last out" principle
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(9);
        stack.push(8);
        stack.push(3);

        System.out.println("Top element in stack : " + stack.peek());

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }
}
