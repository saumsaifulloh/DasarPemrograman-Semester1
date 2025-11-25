import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class modifikasiNumbers17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int [][] myNumbers = new int [3][];
       myNumbers [0] = new int [5];
       myNumbers [1] = new int [3];
       myNumbers [2] = new int [1];

       for(int i = 0; i < myNumbers.length; i++) {
          System.out.println(Arrays.toString(myNumbers[i]) );
          for(int j = 0; j < myNumbers[i].length; j++) {
              System.out.print("panjang baris ke- " + (i+1) + " : " + myNumbers[i].length);
              myNumbers[i][j] = sc.nextInt();
          }
       }
    }
    
} 
    

