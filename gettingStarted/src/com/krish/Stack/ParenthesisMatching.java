package com.krish.Stack;

import java.util.Stack;

public class ParenthesisMatching {

    public static void parenthesisMatching(String expr) {
        char[] exprArr = expr.toCharArray();
        Stack<Character> container = new Stack<Character>();
    }
    public static void main(String[] args) {
        parenthesisMatching("((1 + 2) / (4 * 5))");
    }
}
