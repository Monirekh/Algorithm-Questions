import java.util.Scanner;
import java.util.*;

public class PrintDiamond {
    public static void main(String args[]) {
      
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      
      if(num>=1 && num<=19 && (num%2 == 1)){
          
          int numStar, numSpace;
          numStar=numSpace=0;
          // for 1
          for (int i=0; i<=num/2; i++){  // first half of pattern --- iterate on rows
              
              numStar = 2*i + 1;
              numSpace = num - numStar;
              int usedSpace = 0;
              // 1.print space
              while(usedSpace < (numSpace/2)){
                 System.out.print(" ");
                 usedSpace++;
              }
              // 2.print star
              for (int j=0; j<numStar; j++){
                  System.out.print("*");
              }
              //------------------------ second pattern 
              // 3. print space
              usedSpace = 0;
              while(usedSpace < (numSpace)){
                  System.out.print(" ");
                  usedSpace++;
              }
              // 4.print star
              for (int k=0; k<numStar; k++){
                  System.out.print("*");
              }
            //   usedSpace = 0;
            //   while(usedSpace < (numSpace/2)){
            //       System.out.print(" ");
            //       usedSpace++;
            //   }
              System.out.println();
              
          } // end for 1
          
          // ------------------------------- second half of the pattern 
          numSpace=0;
          numStar = num - 2;
          // for 2
          for (int i=(num/2) +1; i<num; i++){ // secon dhalf -- iterate on the second part of rows
              
              numSpace= num - numStar;
              // 1.print space
              int usedSpace = 0;
              // 1.print space
              while(usedSpace < (numSpace/2)){
                 System.out.print(" ");
                 usedSpace++;
              }
              // 2.print star
              for (int l=0; l<numStar; l++){
                  System.out.print("*");
              }
              //------------------------ second pattern 
              // 3. print space
              usedSpace = 0;
              while(usedSpace < (numSpace)){
                  System.out.print(" ");
                  usedSpace++;
              }
              // 4.print star
              for (int k=0; k<numStar; k++){
                  System.out.print("*");
              }
              
              numStar -= 2;
              System.out.println();
          } // end for 2
      } else{
          System.out.println("Not Valid!");
      } // end if-else
    } // end main func
} // end main class