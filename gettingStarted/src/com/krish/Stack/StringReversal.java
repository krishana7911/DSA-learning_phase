package com.krish.Stack;

import java.util.Stack;

public class StringReversal {
    public static void main(String[] args) {
        printMatchedPair("krishana");
    }

    public static void printMatchedPair(String expr) {
        char[] stringArr = expr.toCharArray();
        Stack<Character> stack = new Stack<Character>();


        for(int i = 0; i < stringArr.length; i++){
            stack.push(stringArr[i]);
        }

        for (int i = 0; i < stringArr.length; i++){
            stringArr[i] = stack.pop();
        }

        stringArr.toString();

        System.out.println(stringArr);
    }
}
