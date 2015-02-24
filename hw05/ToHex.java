//Paige Howes
//Homework #5
//February 24, 2015

//import scanner
import java.util.Scanner;
//define class
public class ToHex {
    //main method
    public static void main (String [] args) {
        //accept input for RGB values
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter three numbers representing RGB values: ");
        //make sure digits entered are integers
        if (myScanner.hasNextInt() && myScanner.hasNextInt() && myScanner.hasNextInt()) {
            int r = myScanner.nextInt();
            int g = myScanner.nextInt();
            int b = myScanner.nextInt(); 
            if (r > 255 || g > 255 || b > 255) {
                System.out.println("Sorry, you must enter values between 0-255.");
            }//end if statement making sure integers are within range
            else {
                System.out.print("The decimal numbers R:" + r + ", G:" + g + ", B:" + b + " is represented in hexadecimal as: ");
                int red = r / 16;
                if (red < 10) {
                    int rR = red;
                    System.out.print(rR);
                }
                else {
                    switch (red) {
                        case 10:
                            String rR = "A";
                            System.out.print(rR);
                            break;
                        case 11:
                            rR = "B";
                            System.out.print(rR);
                            break;
                        case 12:
                            rR = "C";
                            System.out.print(rR);
                            break;
                        case 13:
                            rR = "D";
                            System.out.print(rR);
                            break;
                        case 14:
                            rR = "E";
                            System.out.print(rR);
                            break;
                        case 15:
                            rR = "F";
                            System.out.print(rR);
                            break;  
                    }
                }
                int remainR = r % 16;
                if (remainR < 10) {
                        int remainderR = remainR;
                        System.out.print(remainderR);
                }
                else {
                    switch (remainR) {
                       case 10:
                            String remainderR = "A";
                            System.out.print(remainderR);
                            break;
                        case 11:
                            remainderR = "B";
                            System.out.print(remainderR);
                            break;
                        case 12:
                            remainderR = "C";
                            System.out.print(remainderR);
                            break;
                        case 13:
                            remainderR = "D";
                            System.out.print(remainderR);
                            break;
                        case 14:
                            remainderR = "E";
                            System.out.print(remainderR);
                            break;
                        case 15:
                            remainderR = "F";
                            System.out.print(remainderR);
                            break; 
                    }
                }
                int green = g / 16;
                if (green < 10) {
                    int gG = green;
                    System.out.print(gG);
                }
                else {
                    switch (green) {
                        case 10:
                            String gG = "A";
                            System.out.print(gG);
                            break;
                        case 11:
                            gG = "B";
                            System.out.print(gG);
                            break;
                        case 12:
                            gG = "C";
                            System.out.print(gG);
                            break;
                        case 13:
                            gG = "D";
                            System.out.print(gG);
                            break;
                        case 14:
                            gG = "E";
                            System.out.print(gG);
                            break;
                        case 15:
                            gG = "F";
                            System.out.print(gG);
                            break;
                    }
                }
                int remainG = g % 16;
                if (remainG < 10) {
                    int remainderG = remainG;
                    System.out.print(remainderG);
                }
                else {
                    switch (remainG) {
                        case 10:
                            String remainderG = "A";
                            System.out.print(remainderG);
                            break;
                        case 11:
                            remainderG = "B";
                            System.out.print(remainderG);
                            break;
                        case 12:
                            remainderG = "C";
                            System.out.print(remainderG);
                            break;
                        case 13:
                            remainderG = "D";
                            System.out.print(remainderG);
                            break;
                        case 14:
                            remainderG = "E";
                            System.out.print(remainderG);
                            break;
                        case 15:
                            remainderG = "F";
                            System.out.print(remainderG);
                            break;
                    }
                }
                int blue = b / 16;
                if (blue < 10) {
                    int bB = blue;
                    System.out.print(bB);
                }
                else {
                    switch (blue) {
                        case 10:
                            String bB = "A";
                            System.out.print(bB);
                            break;
                        case 11:
                            bB = "B";
                            System.out.print(bB);
                            break;
                        case 12:
                            bB = "C";
                            System.out.print(bB);
                            break;
                        case 13:
                            bB = "D";
                            System.out.print(bB);
                            break;
                        case 14:
                            bB = "E";
                            System.out.print(bB);
                            break;
                        case 15:
                            bB = "F";
                            System.out.print(bB);
                            break;
                    }
                }
                int remainB = b % 16;
                if (remainB < 10) {
                    int remainderB = remainB;
                    System.out.println(remainderB);
                }
                else {
                    switch (remainB) {
                        case 10:
                            String remainderB = "A";
                            System.out.println(remainderB);
                            break;
                        case 11:
                            remainderB = "B";
                            System.out.println(remainderB);
                            break;
                        case 12:
                            remainderB = "C";
                            System.out.println(remainderB);
                            break;
                        case 13:
                            remainderB = "D";
                            System.out.println(remainderB);
                            break;
                        case 14:
                            remainderB = "E";
                            System.out.println(remainderB);
                            break;
                        case 15:
                            remainderB = "F";
                            System.out.println(remainderB);
                            break;
                    }
                }
            }//end else statement
        }//end if statement checking for integer
        else {
            System.out.println("Sorry, your input must consist of integers.");
        }//end else statement asking for integers
    }//end main method
}//end public class