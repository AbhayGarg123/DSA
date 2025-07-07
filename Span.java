// Span of  Array 
import java.io. *;
import java.util.*;
import java.util.Scanner;
public class Span{
    public static int findSpan(int[] arr){
        if (arr == null || arr.length == 0) {
            return 0; // Return 0 for empty array
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max - min;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int span = findSpan(arr);
        System.out.println("The span of the array is: " + span);
    }
}
