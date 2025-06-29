// print pattern 7
//         *       
//       * * *     
//     * * * * *   
//   * * * * * * * 
//     * * * * *   
//       * * *     
//         * 
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for(int j=i; j < rows; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <rows; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("  ");
            }
            for (int k =0; k<2*rows-2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}