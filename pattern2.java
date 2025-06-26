// print pattern2 
//       * 
//     * *
//   * * *
// * * * *
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Print stars
            }
            System.out.println(); // Move to the next line
        }
        
        sc.close();
    }
}