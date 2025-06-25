// Banjamin bulb 
// Problem: Given n bulbs that are initially off, you toggle the state of the bulbs in a specific pattern.
import java.util.Scanner;
public class BenjaminBulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of bulbs: ");
        int bulbs = sc.nextInt();
        int count = 0;
        System.out.println("The number of bulbs that are on after toggling is: ");
        for(int i = 1; i <= bulbs; i++) {
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count % 2 != 0) {
                System.out.print(i + " ");
            }
            count = 0; 
        }
        sc.close();
    }
}