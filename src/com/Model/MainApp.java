package com.Model;



public class MainApp {
    public static void main(String[] args) {

        StackX stack = new StackX(10); //create a stack with maxSize 10

        //insert items , that means push
        stack.push(30);
        stack.push(80);
        stack.push(100);
        stack.push(25);

        stack.display();

        System.out.println();



        /*We have a stack with 10 locations
        * 4 locations are filled
        * 6 are empty*/

        /*Delete items means , Pop*/

        while (!stack.isEmpty()){ //until the stack is empty,delete item from stack. if stack is NOT Empty only we pop
            System.out.println(stack.pop()); //to display

            /*If u run and see the output u can see the pop is done using LIFO principle*/

        }

    }
}
