package com.Lab01;

public class MainApp {
    public static void main(String[] args) {
        BracketCheck bracketCheck = new BracketCheck("5 * 6 + (2 - 5)");
        bracketCheck.CheckBracket();

        /*U can check the output
        * for the expression 3 + (( 6 * 2) – 3) ; OUTPUT IS VALID STRING
        * for the expression 3 + (( 6 * 2) – 3 ; OUTPUT IS INVALID STRING

        * for the expression 5 * 6 + (2 - 5) ; OUTPUT IS VALID STRING
        * for the expression 5 * 6 + (2 - 5 ; OUTPUT IS INVALID STRING */
    }
}

/*Here u just have to identify how to use the STACK concept into this scenario
* U have to get the idea on how to apply the STACK*/

/*Just assume there are 11 elements
* They are 3 + (( 6 * 2) – 3)
* Just think of them as elements
* U have to only check whether the brackets are available or not
* Within the for loop we check whether we have the start bracket and end bracket
* Then we check the Stack Part */
