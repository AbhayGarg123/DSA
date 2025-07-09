import java.util.Scanner;

public class AddArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] sumArray = new int[size];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        System.out.println("Resultant array after addition:");
        for (int i = 0; i < size; i++) {
            System.out.print(sumArray[i] + " ");
        }

        sc.close();
    }
}
