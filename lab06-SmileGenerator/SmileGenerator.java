//Paige Howes
//Lab #6
//February 27, 2015

//define class
public class SmileGenerator {
    //main method
    public static void main (String [] args) {
        
        //first step
        System.out.println("Step 1:");
        int n = 0;
        while (n < 5) {
            System.out.print(":) ");
            n++;
        }//end of while statement
        System.out.println();
        
        //second step
        System.out.println("Step 2:");
        int m = (int) (Math.random() * 100);
        while (m > 0) {
            System.out.print(":) ");
            m--;
        }//end of while statement
        System.out.println();
        
        //third step
        System.out.println("Step 3:");
        int r = (int) (Math.random() * 100);
        int t = 0;
        int thirty = r / 30;
        int remainder = r % 30;
        while (thirty > 0) {
            while (t < 30) {
                System.out.print(":) ");
                t++;
            }
            System.out.println();
            thirty--;
        }
        while (remainder > 0) {
            System.out.print(":) ");
            remainder--;
        }
        System.out.println();
        
        //fourth step
        System.out.println("Step 4:");
        int i = 0;
        int j = 1;
        while (j <= 5) {
          System.out.print(":) ");
          i++;
          if (i == j) {
              System.out.println();
              j++;
          }
        }
        System.out.println();
        
    }//end of main method
}//end of class