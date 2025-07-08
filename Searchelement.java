// seacr an element in an array
import java.io.*;
import java.util.*;
public class Searchelement {
    public static int searchElement(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; 
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int target = scn.nextInt();
        
        int index = searchElement(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
