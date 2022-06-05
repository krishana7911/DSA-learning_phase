package com.krish.Stack;

import java.util.Stack;

public class ParenthesisMatching {

    public static void parenthesisMatching(String expr){
        char[] exprArr = expr.toCharArray();
        Stack<Character> container = new Stack<Character>();

        for (int i = 0; i < exprArr.length; i++){
            if (exprArr.charAt(i) == '(' ) {
                container.push(exprArr[i]);
            }
        }
    }

    public static void main(String[] args) {
        parenthesisMatching("((1 + 2) / (4 * 5))");
    }
}
