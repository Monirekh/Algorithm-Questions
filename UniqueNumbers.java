import java.util.Scanner;
import java.util.Arrays;

public class UniqueNumbers{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int len = sc.nextInt();
        
        int[] count = new int[len];
        int[] numbers = new int[len];
        
        int j = 0;
        int counter = 0;
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        // reading inputstream
        while (j < len){
            numbers[j] = sc.nextInt();
            count[j] = count[j] + 1;
            j++;
        }

        int XOR = 0;
        // finding unique numbers
       
        int uniqueCount = 0;
        for (int i=0; i<len; i++){
            if(count[i]==1){
                uniqueCount ++;
                XOR = numbers[i] ^ XOR;
            }
        }
        if(uniqueCount == 0){
            System.out.println("0");
        }
        else{
            System.out.println(XOR);
        }
        
    }
}