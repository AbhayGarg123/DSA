// print pattern 11
import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 0; i < rows; i++) {
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0; j<rows-2*i;j++) {
                System.out.print("@");
            }
            // System.out.println("*");
            if(i != rows - 1) {
                System.out.println("*");
        }
    }
        System.err.println();
    for(int i=0; i<rows-1; i++) {
        for(int j=0; j<rows-i-2; j++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for(int j=0; j<2*i+1; j++) {
            System.out.print("@");
        }
            System.out.println("*");
        
    }
    sc.close();
}
}