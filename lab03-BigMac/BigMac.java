//Paige Howes
//Lab 03
//Feb 6, 2015
//
//Computes the cost of buying Big Macs
//
//import scanner
import java.util.Scanner;
//define the class
public class BigMac {
    //main method
    public static void main (String [] args) {
      Scanner myScanner;
      myScanner = new Scanner (System.in);
      
      //find number of Big Macs
      System.out.print("Enter the number of Big Macs (an integer > 0): ");
      int nBigMacs = myScanner.nextInt ();
      
      //find cost of a Big Mac
      System.out.print("Enter the cost per Big Mac as" + " a double (in the form xx.xx): ");
      double bigMac$ = myScanner.nextDouble ();
      
      //find tax rate
      System.out.print("Enter the percent tax as a whole number (xx): ");
      double taxRate = myScanner.nextDouble ();
      taxRate/=100; //changes percent to proportion
      
      //calculations
      double cost$;
      int dollars, //whole dollar amount
      dimes, pennies; //digits to the right of the decimal place
      cost$ = nBigMacs * bigMac$ * (1+taxRate);
      dollars = (int) cost$;
      dimes = (int) (cost$ * 10) % 10;
      pennies = (int) (cost$ * 100) % 10;
      
      //print results
      System.out.println("The total cost of " + nBigMacs + " Big Macs, at $" + bigMac$ + " per Big Mac, with a sales tax of " + (int) (taxRate*100) + "%, is $" + dollars + '.' + dimes + pennies);
      
    } //end of main method
} //end of class