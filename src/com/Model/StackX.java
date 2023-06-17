package com.Model;

public class StackX {
    /*1)First of all to implement a stack we need an array
    * Lets declare an array with double as data type*/
    private double []stackArray;

    /*2)Then we have to set a size to the array
    * size means no of locations. So it should be int*/
    private int maxSize; //size of stack array

    /*3)Inside a stack u know , u r maintaining an int type
    * variable call top*/
    private int top; //top of the stack

    /*4)Then lets create the constructor
    * i)One purpose of creating a constructor is to assign the values to the attributes*/


    /*public StackX(double[] stackArray, int maxSize, int top) {
        this.stackArray = stackArray;
        this.maxSize = maxSize;
        this.top = top;
    }*/

    /*Now here without a proper initialized size we cant have a array
    * So we gonna pass that size as a parameter in the constructor */

    public StackX(int s) {
        maxSize = s; //set array size
        stackArray = new double[maxSize]; //now we create the array with the size we initialized
        top = -1; //no items in the stack
    }
    /*This is how the constructor is implemented*/

    /*Now lets create the methods*/

    /*Push method means ur just inserting. not returning anything
    * Therefore void
    * and we are going to push an item, so its data type is double*/
    public void push(double j){
        /*1)Increment top by 1*/
        //top++;
        /*2)Access the incremented top and assign the j*/
        //stackArray[top] = j;

        /*3)We have to check whether the stack is full*/
        if (top == maxSize-1)
            System.out.println("Stack is full");
        else
            /*Without writing in 2 lines , we can write this in a single line of code*/
            stackArray[++top] = j; //++top is pre-increment
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*Pop method returns the uppermost element
    * So the return type is double
    * No parameters need to passed*/
    public  double pop(){

        //1)First thing u have to do is get the top most element and return it
        //but remember the return statement should be the last statement in any scenario
        //otherwise there will be errors
        //return stackArray[top];

        //2)After returning we have to decrement the top by one
       // top--;

        /*To solve the issue mentioned in (1) we can write the code as follows*/
       // return stackArray[top--];



        /*3)If stack is empty nothing to remove
        * So we have to check if stack is empty*/
        if (top == -1){
            System.out.println("Stack is empty");
            return -99; //return some error value which can be casted to double
        }
        else
            return stackArray[top--];
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*For peek u just have to do some modification to the pop()
    * u just want to return the top value only*/
    public  double peek(){
        /*If stack is empty nothing to remove
         * So we have to check if stack is empty*/
        if (top == -1){
            System.out.println("Stack is empty");
            return -99; //return some error value which can be casted to double
        }
        else
            return stackArray[top]; // just return the top value
    }

    /*QUESTION*/

    public boolean isEmpty(){
        if (top == -1)
            return  true;
        else
            return false;

        //we can write this in  a single line as well
        //return (top == -1); so if this is true, it will return true
    }
    public boolean isFull(){
        if (top == maxSize-1)
            return  true;
        else
            return false;

        //we can write this in  a single line as well
        //return (top == maxSize-1); so if this is true, it will return true
    }

    public int getCount(){
        return (top + 1);
    }

    public void display() {
        for (int k = 0; k < maxSize; k++) {
            System.out.println(stackArray[k]);
        }
    }//end of display

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        /*    public void deleteMiddle(){

         *//*Input : Stack[] = [1,2,3,4,5]*//*

        StackX s = new StackX(5); //Main stack
        StackX sl = new StackX(5);//creating a temporary stack

        int n = s.maxSize;
        int count = 0;

        *//*Run a while loop till maxSize becomes equal to half the initial size of the given stack*//*

         *//*Put first n/2 element of s in sl*//*
        while (count < n/2){
            double c = s.peek(); //return and assign the top value to c
            s.pop(); //then we pop that value/item
            sl.push(c);//and then poped item is push to the temporary stack sl
            count++;
        }
        *//*While loop finishing means 4,5 items are popped. Now the top variable is pointing to the middle item , 3*//*

        //Now delete the middle element
        s.pop();

        *//*Now we have to push all the items in the temporary stack sl to s*//*
        //That means pop from sl and push to s
        while (!sl.isEmpty()){
            s.push(sl.peek()); //push the values at the top
            sl.pop();
        }
    }//end of deleteMiddle*/


}//end of StackX class
