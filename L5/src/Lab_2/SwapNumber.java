package Lab_2;
/*
Created by: Dany
Created on  : 15:37
This is program to
*/

public class SwapNumber {
    public static void main(String[] args) {

        int number1, number2;   // declare 2 integer variables
        number1 = 25;           // store 25 in number1
        number2 = 39;           // store 39 in number2
        int temp;               // declare third variable to act
                                // as a temporary variable

        //Print out initial values to screen
        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);
        System.out.println();


        temp = number1;         // copy value of number1 into temp
        number1 = number2;      // copy value in number2 into number1
        number2 = temp;	        // copy value in temp into number2

        // Print out new values to screen
        System.out.println("Value of number1 is now " + number1);
        System.out.println("Value of number2 is now " + number2);
    }
}
