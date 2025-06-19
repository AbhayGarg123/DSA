import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        // check the number is prime or not
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        //print all prime numbers till the given number
        System.out.println("Prime numbers till " + num + ":");
        for(int i=2; i<=num; i++){
            int prime_count=0;
            for(int j=1; j<=i; j++){
                // int prime_count=0;
                if(i%j==0){
                    prime_count++;
                }
            }
            if(prime_count==2){
                System.out.print(i + " ");
            }
        }
        sc.close(); 
}
}
