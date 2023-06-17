package com.Model;

public class MainAppChar {
    public static void main(String[] args) {
        StackChar stackChar = new StackChar(5);

        //Insert items
        stackChar.push('y');
        stackChar.push('e');
        stackChar.push('r');
        stackChar.push('a');
        stackChar.push('n');




        while (!stackChar.isEmpty()){
            System.out.println(stackChar.pop());
        }

    }
}
