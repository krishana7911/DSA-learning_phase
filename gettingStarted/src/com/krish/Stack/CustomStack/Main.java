package com.krish.Stack.CustomStack;

import com.krish.Stack.CustomStack.CustomStack;

public class Main {
    public static void main(String[] args) {

        CustomStack stack = new CustomStack();
        stack.push(36);
        stack.push(23);
        stack.push(7);

        stack.print();

        stack.peek();

        System.out.println(System.lineSeparator() + stack.pop() + " popped from the stack");
        System.out.println(stack.pop() + " popped from the stack");
        System.out.println(stack.pop() + " popped from the stack");
    }
}
