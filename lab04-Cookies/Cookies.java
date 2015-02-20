//Paige Howes
//Lab #4
//February 13, 2015
//
//import scanner
import java.util.Scanner;
//define class
public class Cookies {
    //main method
    public static void main (String [] args) {
        
        //construct scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //accept input
        System.out.print("Enter the number of people: ");
        int people = myScanner.nextInt();
        
        //check if input is an interger
        if (myScanner.hasNextInt()) {
            if (people > 0) {
                
                //input number of cookies
                System.out.print("Enter the number of cookies you are planning to buy: ");
                int cookies = myScanner.nextInt();
                if (cookies > 0) {
                    System.out.print("How many cookies do you want each person to get? ");
                    int perPerson = myScanner.nextInt();
                    int totalCookies = perPerson * cookies;
                    System.out.println("Total cookies: " + totalCookies);
                }//end if statment
                else {
                    System.out.println("You did not enter a positive integer.");
                }
            }//end if statement
            else {
                System.out.println("You did not enter a positive integer.");
                return;
            }
        }//end if statemnt
        else {
            System.out.println("You did not enter an integer.");
            return;
        }//end else statement
    }//end main method
}//end of class