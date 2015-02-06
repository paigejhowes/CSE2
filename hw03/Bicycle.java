//Paige Howes
//Program #1 of Homework 3
//February 10, 2015
//
//import scanner
import java.util.Scanner;
//define class
public class Bicycle {
    //add main method
    public static void main (String [] args) {
        
        //construct the scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //accept input
        System.out.print("Enter the number of seconds: ");
        int seconds = myScanner.nextInt ();
        System.out.print("Enter the number of counts: ");
        int counts = myScanner.nextInt ();
        
        //constants
        double wheelDiameter = 27.0,
        PI = 3.14159,
        feetPerMile = 5280,
        inchesPerFoot = 12,
        secondsPerMinute = 60,
        minutesPerHour = 60;
        double distance, time, milesPerHour;
        
        //calculations
        distance = counts * wheelDiameter * PI / inchesPerFoot / feetPerMile;
        time = seconds / secondsPerMinute;
        milesPerHour = distance / (time / minutesPerHour);
        
        //print output
        System.out.printf("The distance was %3.2f miles and took %3.1f minmutes.", distance, time);
        System.out.printf("The average mph was %3.2f", milesPerHour);
        
    } //end of main method
} //end of clas