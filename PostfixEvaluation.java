// solve postfix expression 
import java.util.*;

public class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix expression (e.g., 2 3 1 * + 9 -): ");
        String postfix = sc.nextLine();

        int result = evaluatePostfix(postfix);
        System.out.println("Result = " + result);
    }

    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expr.split("\\s+"); 

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            }
            else {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperation(a, b, token.charAt(0));
                stack.push(result);
            }
        }

        return stack.pop(); 
    }
    public static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static int applyOperation(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b; 
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}
