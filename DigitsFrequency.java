// find the frequency of digit in a given number using function
import java.util.Scanner;
public class DigitsFrequency {
   public static int DigitsFrequency(int num, int digit) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter anumber:");
      int num = scn.nextInt();
        System.out.print("Enter a digit to find its frequency: ");
        int digit = scn.nextInt();
        if (digit < 0 || digit > 9) {
            System.out.println("Please enter a valid digit (0-9).");
        } else {
            int frequency = DigitsFrequency(num, digit);
            System.out.println("The frequency of digit " + digit + " in number " + num + " is: " + frequency);
        }
    }
}