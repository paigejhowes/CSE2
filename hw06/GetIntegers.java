//Paige Howes
//Program #1 of Homework #6
//March 3, 2015

//import scanner
import java.util.Scanner;
//define class
public class GetIntegers {
    //main method
    public static void main (String [] args) {
        
        //define scanner
        Scanner myScanner = new Scanner(System.in);
        
        //define integers
        int i = 0;
        int total = 0;
        
        //loop to ask for imput
        while (i < 5) {
            System.out.print("Enter integer: ");
            //if statement to meet boundaries
            
            if (myScanner.hasNextInt()) {
                //if to check if positive
                int integer = myScanner.nextInt();
                if (integer >= 0) {
                    total = total + integer;
                    i++;
                }
                else {
                    System.out.println("Please enter only positive numbers.");
                }
            }//end of if statement
            else {
                System.out.println("Please enter an integer.");
                return;
            }//end of else statement
         }//end of while loop
        
        //print total
        System.out.println("The total of the integers is " + total + ".");
        
    }//end of main method
}//end of class