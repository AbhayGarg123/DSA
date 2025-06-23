// Find the prime factors of a given number
import java.util.Scanner;
public class Primefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to find its prime factors: ");
        int n = sc.nextInt();
        System.out.print("Prime factors of " + n + " are: ");
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        if (n > 1) {
            System.out.print(n); 
        }
        
        sc.close();
    }
}