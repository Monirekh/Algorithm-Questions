import java.util.Scanner;
 
public class PrintNumbers
{
    // Program to read input from console in Java using `Scanner`
    public static void main(String[] args)
    {
        // Constructs a new `Scanner` instance to scan values from the input stream
        Scanner scanner = new Scanner(System.in);
        // Long num;
        // num = scanner.nextLong();
 
    //   String number = String.valueOf(num);
      String number = scanner.next();
      if(number.length()<101){
          for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            System.out.print(j + ": ");
            for (int k=0; k<j; k++){
                System.out.print(j);
            }
            System.out.print("\n");
            }
    
            // close the scanner
            scanner.close();
      } // end if
      else {
          System.out.print("Size Limit is 100!");
      }
    }
}