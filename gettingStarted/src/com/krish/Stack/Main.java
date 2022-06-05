package com.krish.Stack;

public class Main {
    public static void main(String[] args) {

        CustomStack stack = new CustomStack(3);
        stack.push(36);
        stack.push(23);
        stack.push(7);
        stack.push(5);  // pushing an extra element

        stack.print();

        stack.peek();

        System.out.println(System.lineSeparator() + stack.pop() + " popped from the stack");
        System.out.println(stack.pop() + " popped from the stack");
        System.out.println(stack.pop() + " popped from the stack" + System.lineSeparator());


        // Checking for implementation of dynamic stack
        DynamicStack stack1 = new DynamicStack(4);

        System.out.println("checking whether DynamicStack works or not");

        stack1.push(5);
        stack1.push(1);
        stack1.push(4);
        stack1.push(3);
        stack1.push(7);
        //the above item will only be pushed if stack size is doubled

    }
}
