import java.util.Scanner;
import java.util.Stack;

public class Duplicatebracket {

    public static boolean hasDuplicateBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();  
                    }
                    stack.pop(); 
                }
            } else {
                stack.push(ch); 
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String input = sc.nextLine();

        if (hasDuplicateBrackets(input)) {
            System.out.println("Duplicate brackets are available.");
        } else {
            System.out.println("Duplicate brackets are not available.");
        }

        sc.close();
    }
}
