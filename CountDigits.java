//Count number of digits in the given number of user input and also print the reverse of the number 
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        System.out.println("Digits in reverse order: ");
        while (num != 0) {
            System.out.print(num % 10 + " "); 
            num /= 10; 
            count++;   
        }
        System.out.println(); 
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}