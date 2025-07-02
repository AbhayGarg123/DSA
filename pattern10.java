// // print pattern 10
//       *
//     *
//   *
// *
import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 0; i < rows; i++) {
          for(int j=rows-i-1; j>0;j--) {
                System.out.print("  ");
            }
            System.out.println("*");
            // System.out.println(); 
        }
        sc.close();
    }
}