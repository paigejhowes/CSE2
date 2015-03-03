//Paige Howes
//Program #3 of Homework #6
//March 3, 2015

//define class
public class MakeSymbols {
    //main method
    public static void main (String [] args) {
        
        //generate random number
        int number = (int) (Math.random() * 100);
        System.out.println("Random number generated: " + number);
        
        //decide if odd or even
        if (number % 2 == 0) {
            System.out.print("The output pattern: ");
            do {
                System.out.print("*");
                number--;
            } while (number > 0);
            System.out.println();
        }
        else {
            System.out.print("The output pattern: ");
            do {
                System.out.print("&");
                number--;
            } while (number > 0);
            System.out.println();
        }
        
    }
}