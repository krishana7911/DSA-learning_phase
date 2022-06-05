package com.krish.Stack.CustomStack;

public class CustomStack {
    protected int[] data;
    private static final int SIZE = 10;

    int top = -1;

    public CustomStack(){
        this(SIZE);
    }
    public CustomStack(int stackSize){
        this.data = new int[stackSize];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack overflow");
            return false;
        }
        System.out.println(item + " pushed in the stack");
        top++;
        data[top] = item;
        return true;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Cannot pop from an empty stack");
        }
        //System.out.println(data[top]);
        return data[top--];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Cannot peek in an empty stack");
        }
        System.out.println(System.lineSeparator() + data[top] + " is at the top of stack");
        return data[top];
    }

    public void print(){
        for (int i = 0; i <= top; i++){
            System.out.print(data[i] + " ");
        }
    }

    private boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == data.length - 1;
    }
}

