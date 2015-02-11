//Paige Howes
//Problem #3 for Homework 3
//February 10, 2015
//
//import scanner
import java.util.Scanner;
//define class
public class FourDigits {
    //main method
    public static void main (String [] args) {
        
        //construct the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //accept input
        System.out.print("Enter number ");
        double number = myScanner.nextDouble ();
        
        //calculations
        int wholeNumber = (int) number;
        number = number - wholeNumber;
        int digits = (int) (number * 10000);
        int firstDigit = digits / 1000;
        int secondDigit = (digits - (firstDigit * 1000)) / 100;
        int thirdDigit = (digits - (firstDigit * 1000) - (secondDigit*100)) / 10;
        int fourthDigit = (digits - (firstDigit *1000) - (secondDigit * 100) - (thirdDigit * 10));
       
        //print result
        System.out.println("The four digits are " + firstDigit + secondDigit + thirdDigit + fourthDigit);
        
    } //end of main method
} //end of class