package com.Model;

public class StackChar {
    private final char []stackArrayChar;
    private final int maxSize;
    private int top;

    public StackChar(int s) {
        maxSize = s;
        stackArrayChar = new char[maxSize];
        top = -1;
    }

    public void push(char ch){
        if(top == maxSize -1){
            System.out.println("Stack is full");
        }
        else
            stackArrayChar[++top] = ch;

    }

    public char pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return 'f';
        }
        else
            return stackArrayChar[top--];
    }

    public char peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return 'f';
        }
        else
            return stackArrayChar[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }





}//end of StackChar
