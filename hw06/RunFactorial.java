//Paige Howes
//Program #2 of Homework #6
//March 3, 2015

//import scanner
import java.util.Scanner;
//define class
public class RunFactorial {
    //main method
    public static void main (String [] args) {
        
        //define scanner
        Scanner myScanner = new Scanner(System.in);
        
        //accept input
        System.out.print("Please enter an integer between 9 and 16: ");
        //check conditions
        if (myScanner.hasNextInt()) {
            int integer = myScanner.nextInt();
            if (integer < 9 || integer > 16) {
                System.out.println("Invalid input. Please enter again.");
            }
            else {
                System.out.println("Input accepted.");
                
                //define variables
                int count = integer;
                int total = 1;
                
                //calculations
                while (count > 0) {
                    total *= count;
                    count--;
                }
                //print total
                System.out.println(integer + "!=" + total);
            }
        }
        else {
            System.out.println("Invalid input. Please enter again. ");
        }
        
    }//end of main method
}//end of class