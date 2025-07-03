// find the factorial of a number using function 
import java.util.*;
public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if(n<0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; 
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
       Scanner scn= new Scanner(System.in);
       System.out.print("Enter a number to find its factorial: ");
        int num = scn.nextInt();
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}