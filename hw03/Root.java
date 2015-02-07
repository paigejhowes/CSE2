//Paige Howes
//Program #2 of Homework 3
//February 10, 2015
//
//import scanner
import java.util.Scanner;
//define class
public class Root {
    //main method
    public static void main (String [] args) {
        
        //construct the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //accept input
        System.out.print("Enter number for cube root: ");
        double number = myScanner.nextDouble ();
        
        //calculatations
        double guess = number / 3;
        guess = (2 * guess * guess * guess + number) / (3 * guess * guess);
        guess = (2 * guess * guess * guess + number) / (3 * guess * guess);
        guess = (2 * guess * guess * guess + number) / (3 * guess * guess);
        guess = (2 * guess * guess * guess + number) / (3 * guess * guess);
        guess = (2 * guess * guess * guess + number) / (3 * guess * guess);
        double root = guess * guess * guess;
        
        //print result
        System.out.println("The cube root is " + guess);
        System.out.println(guess + "*" + guess + "*" + guess + "=" + root);
        
    }//end of main method
}//end of class
