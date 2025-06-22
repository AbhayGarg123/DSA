//find the GCD (Greatest Common Divisor) and LCM (Least Common Multiple) of two numbers
import java.util.Scanner;
public class GCDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int gcd=1;
        for(int i=2; i<=a && i<=b; i++) {
            if(a%i==0 && b%i==0) {
                gcd = i;
            }
        }
         System.out.println("gcd of " + a + " and " + b + " is: " + gcd);
         // find LCM 
        int lcm = (a * b) / gcd;
        System.out.println("lcm of " + a + " and " + b + " is: " + lcm);
    sc.close();
}
}