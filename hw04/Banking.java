//Paige Howes
//Homework #4 Program #2
//February 17, 2015
//
//import scanner
import java.util.Scanner;
import java.util.Random;
//define class
public class Banking {
    //main method
    public static void main (String [] args) {
        
        //construct scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //give balance
        int balance = (int) (Math.random () * (5000-1000) + 1000);
        
        //give options
        System.out.print("Would you like to 1. deposit, 2. withdraw, or 3. view balance? ");
        int choice = myScanner.nextInt();
        
        //action
        switch (choice) {
            //deposit
            case 1:
                System.out.print("How much would you like to deposit? ");
                int deposit = myScanner.nextInt();
                if (deposit < 0) {
                    System.out.println("Please enter positive number.");
                }//end if
                else {
                    balance = balance + deposit;
                    System.out.println("Your new balance is " + balance + ".");
                }//end else statement
            break;
            //withdraw
            case 2:
                System.out.print("How much would you like to withdraw? ");
                int withdraw = myScanner.nextInt();
                if (withdraw < 0) {
                    System.out.println("Please enter positive number.");
                }//end if statement
                else {
                    balance = balance - withdraw;
                    System.out.println("Your new balance is " + balance + ".");
                }//end else statement
            break;
            //view balance
            case 3:
                System.out.println("Your balance is " + balance + ".");
            break;
        }//end of switch
    }//end main method
}//end class