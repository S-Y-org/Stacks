package com.Lab01;

import com.Model.StackChar;

public class BracketCheck {

    /*We need a string type variable to store the expression
    * EX: 3 + (( 6 * 2) – 3)
    * We will declare the above expression in the main class
    * Until that we have to do the neccessary functionalities here*/

    private String inputStr;

    //Constructor implementation
    public BracketCheck(String in) {
        /*We are just initializing a new variable for the existing inputStr variable*/
        inputStr = in; //Basically we are going to apply our expression--> 3 + (( 6 * 2) – 3) to this String variable
    }

    /*Within this method we are going to check the brackets*/
    public void CheckBracket(){
        int size = inputStr.length();//setting the maximum size of the stack, which is  11  for this expression--->[3 + (( 6 * 2) – 3)]

        /*Lets create an instance from my StackChar class*/
        StackChar stackChar = new StackChar(size); //maxSize = 11



        for (int i = 0 ; i < size ; i++){ //size is the maxSize of our stack

            /*Initially we are checking  for the starting bracket
            * of 3 + (( 6 * 2) – 3)
            * If the bracket exist we can insert elements to the stack
            * We are taking abt the bracket that comes after 3 +      */

            if (inputStr.charAt(i) == '('){

                /*If starting bracket is there then insert/PUSH the next bracket
                *  3 + ( (     */
                stackChar.push('(');
            } else if (inputStr.charAt(i) == ')') { //if its the closing bracket at the end of the expression just call the pop
                stackChar.pop();
            }
        }
        /*From above method we checked the conditions*/



        /*Now lets have the print statements accordingly*/

        /*If our stack is not empty , it means that it is the invalid string.
        * Then reason is  ; when expressions such as this --->  5 * 6 + (2 - 5    comes, we can insert/push more elements becuz  the
        * end bracket is not their   */
        if (!stackChar.isEmpty())
            System.out.println("Invalid String");
        else
            System.out.println("Valid String");
        /*If the stack is empty, it means its a Valid String
        * It means there is that final/end Bracket
        * It means we can't insert more elements*/



        /*So the logic here is somewht opposite/reverse
        * Stack is not empty means ---->INVALID STRING ,BECUZ END BRACKET IS NOT AVAILABLE
        * Stack is empty means -----> VALID STRING ,BECUZ END BRACKET IS AVAILABLE*/

    }//End of CheckBracket()



}//end of BracketCheck
