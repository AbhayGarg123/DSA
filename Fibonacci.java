import java.util.Scanner;
// Print the fibonacci series where number of terms is given by the user
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a=0;
        int b=0; 
        int c=0;
        System.out.print("Fibonacci series till " + num + ": ");
        for(int i=0; i<num; i++) {
            System.out.print(c + " ");
            if(c == 0) {
                c=1;
            }else{
                 a = b;
                b = c;
                c = a + b;
            }
            // a = b;
            // b = c;
            // c = a + b;
        }
        sc.close(); 
}
}
