//Paige Howes
//Homework #4 Program #1
//February 17, 2015
//
//scanner
import java.util.Scanner;
//define class
public class WhichNumber {
    //main method
    public static void main (String [] args) {
        
        //construct scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //question one
        System.out.print("Is the number even? ");
        String even = myScanner.next();
        
        //split question one
        if (even.equals("Y")) {
            //question 2 if answer was yes to question one
            System.out.print("Is the number divisible by 3? ");
            String three = myScanner.next();
            if (three.equals("Y")) {
                System.out.println("Your number is 6.");
            }//end if statement
            else {
                //question 3 if answer was no to question two
                System.out.print("Is your number divisible by 4? ");
                String four = myScanner.next();
                //question 4 if answer was yes to question 3
                if (four.equals("Y")) {
                    System.out.print("Is the number divided by 4 greater than 1? ");
                    String one = myScanner.next();
                    if (one.equals("Y")) {
                        System.out.println("Your number is 8.");
                    }//end if statement
                    else {
                        System.out.println("Your number is 4.");
                    }//end else statement
                }//end if statment
                //question 4 if answer was no to question 3
                else {
                    System.out.print("Is it divisible by 5? ");
                    String five = myScanner.next();
                    if (five.equals("Y")){
                        System.out.println("Your number is 10.");
                    }//end if statement
                    else {
                        System.out.println("Your number is 2.");
                    }//end else statement
                }//end else statement
            }//end else statement
        }//end first question if statement
        //question if answer was no to question 1
        else {
            System.out.print("Is your number divisible by 3? ");
            String three = myScanner.next();
            //question if answer was yes to question 2
            if (three.equals("Y")) {
                System.out.print("When divided by 3 is the result greater than 1? ");
                String one = myScanner.next();
                if (one.equals("Y")) {
                    System.out.println("Your number is 9.");
                }//end if statemnt
                else {
                    System.out.println("Your nubmer is 3.");
                }//end else statement
            }//end if statement
            //question if answer was no to question 2
            else {
                System.out.print("Is it greater than 6? ");
                String six = myScanner.next();
                if (six.equals("Y")) {
                    System.out.println("Your number is 7.");
                }//end if statement
                //question if answer was no to question 3
                else {
                    System.out.print("Is it less than 3? ");
                    String less = myScanner.next();
                    if (less.equals("Y")) {
                        System.out.println("Your number is 1.");
                    }//end if statement
                    else {
                        System.out.println("Your number is 5.");
                    }//end else statement
                }//end else statement
            }//end else statement
        }//end else statement
    }//end main method
}//end class