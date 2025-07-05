// conert the decimal number to other base (2-36)
import java.util.Scanner;

public class DecimalTootherbase {
    
    public static String convertToBase(int number, int base) {
        if (base < 2 || base > 36) {
            return "Base must be between 2 and 36.";
        }

        if (number == 0) {
            return "0";
        }

        String result = "";
        while (number > 0) {
            int remainder = number % base;
            char digit;
            if (remainder < 10) {
                digit = (char) ('0' + remainder); 
            } else {
                digit = (char) ('A' + (remainder - 10)); 
            }

            result = digit + result; 
            number = number / base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = scn.nextInt();
        System.out.print("Enter the base to convert to (2-36): ");
        int base = scn.nextInt();

        String result = convertToBase(number, base);
        System.out.println("Converted value: " + result);
    }
}
