//Paige Howes
//Lab 8
//March 20, 2015

import java.util.Scanner;

public class Factorials {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += factorial(i);
        }
    }
    
    public static int factorial (int input) {
        
        int multiply = 1;
        
        for (int j = 1; j <= input; j++) {
            multiply *= j;
        }
        
        System.out.println(multiply);
        return multiply;
    }
    
    public static void print (int input, int sum) {
        System.out.println("The super factorial of " + input + " is equal to " + sum);
    }
}