// print pattern 8
// * * * *   * * * * 
// * * *       * * * 
// * *           * * 
// *               * 
// *               * 
// * *           * * 
// * * *       * * * 
// * * * *   * * * * 
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
          for (int i = 0; i < rows; i++) {
            
           for (int k = 0; k <rows-i; k++) {
                System.out.print("* ");
            }
           
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("  ");
            }
            for (int k = 0; k <rows-i; k++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        for (int i = 0; i < rows; i++) {
            
             for (int k = 0; k <i+1; k++) {
                System.out.print("* ");
            }
            for (int j = 0; j <2*rows-2*i-1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <i+1; k++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
 
        sc.close();
    }
}