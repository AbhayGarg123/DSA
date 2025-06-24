// three sides of a triangle are given by the user , check if it is a right angled triangle or not and find the area of the triangle
import java.util.Scanner;
public class pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the lengths of the three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double area = 0.0;
        if(a*a==b*b+c*c){
            area = 0.5 * b * c;
        }else if(b*b==a*a+c*c){
            area = 0.5 * a * c;
        }else if(c*c==a*a+b*b){
            area = 0.5 * a * b;
        }
        if(area > 0){
            System.out.println("The triangle is a right-angled triangle.");
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("The triangle is not a right-angled triangle.");
        }
        
        sc.close();
    }
    
}