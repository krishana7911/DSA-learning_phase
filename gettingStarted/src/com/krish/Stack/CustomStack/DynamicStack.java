package com.krish.Stack.CustomStack;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super(); //calling default size CustomStack()
    }

    public DynamicStack(int stackSize) {
        super(stackSize); // calling CustomStack(stackSize)
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];

            //copy elements from old to new
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
            System.out.println("the size of stack has been doubled");
        }
        return super.push(item);
    }
}

