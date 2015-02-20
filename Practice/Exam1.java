import java.util.Scanner;
public class Exam1 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter character ");
        string x = scan.next();
        switch (x){
  case ‘y’:
    System.out.println(‘y’);
  case ‘Y’: 
    System.out.println(‘Y’); 
    k /= 2;
  case ‘n’:
    break;
  case ‘N’:
    System.out.println(‘N’);
    k += 5;
    break;
  default:
    System.out.println("default ");
    k *= 5;
}
System.out.printf("k = %2.2f\n", (double)k);
    }
}