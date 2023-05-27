import java.util.Scanner;
import java.util.*;

public class 4Numbers {
    
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int sw=0;
      int[] nums = new int [5];
      nums[0] = scanner.nextInt();
      nums[1] = scanner.nextInt();
      nums[2] = scanner.nextInt();
      nums[3] = scanner.nextInt();
      nums[4] = scanner.nextInt();

      for(int i=0; i<5; i++){
          if (nums[i]<1 && nums[i]>100000){
              sw=1;
          }
      } // end for getting input
      
      if(sw==0){ //valid input
         // Check divisability
         int number = 1, Counter = 0;
         while (number <= nums[0]){
             if((number % nums[1] == 0) || (number % nums[2] == 0) || (number % nums[3] == 0) || (number % nums[4] == 0) ) Counter++;
             number++;
         }
         System.out.println(Counter);
           
      } else{ // Not Valid input!
         System.out.println("Not Valid!");
      } // end if-else
    } // end main func
} // end main class