//Paige Howes
//Homework #8
//March 24,2015

import java.util.Scanner;

public class HW8 {
    
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    public static void cave() {
         System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box() {
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    public static String getInput(Scanner scan, String string) {
        String loser = "";
        string = scan.next();
        if (string != "c" || string != "C") {
            loser = "";
        }
        else if (string == "c" || string == "C") {
            loser = "Yea right LOSER!";
            System.out.println(loser);
            System.exit(0);
        }
        return loser;
    }
    
    public static String getInput(Scanner scan, String string, int trial) {
        String hit = "";
        string = scan.next();
        if (string != "A" || string != "a") {
            int success = (int) (Math.random());
            int strike = 0;
            if (success == 0) {
                hit = "Gosh! How can you miss it!";
            }
            else {
                System.out.println("Critical hit!");
                strike++;
                if (strike == 10) {
                    hit = "Congratulations! You SURVIVED! Get your REWARD!";
                }
                else {
                    hit = "";
                }
            }
        }
        else if (string != "E" || string != "e") {
            int success = (int) (Math.random() * 10);
            if (success == 10) {
                hit = "Congratulations! You SURVIVED! Get your REWARD!";
            }
            else {
                hit = "";
            }
        }
        else if (string != "A" || string != "a" || string != "E" || string != "e") {
            hit = "Executed by the GIANT! Game over!";
        }
        System.out.println(hit);
        return hit;
    }
    
    public static String getInput(Scanner scan) {
        int open = scan.nextInt();
        String box = "";
        switch (open) {
            case 1:
                box = "Wrong number! You get nothing! Better restart the game LOL";
                break;
            case 2:
                box = "Congratulations! You get the treasure!";
                break;
            case 3:
                box = "Wrong number! You get nothing! Better restart the game LOL";
                break;
        }
        System.out.println(box);
        return box;
    }
    
}