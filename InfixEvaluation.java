// infix evaluation 
import java.util.*;

public class InfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String expr = sc.nextLine();

        int result = evaluateInfix(expr);
        System.out.println("Result = " + result);
    }
    public static int evaluateInfix(String expr) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < expr.length()) {
            char ch = expr.charAt(i);
            if (ch == ' ') {
                i++;
                continue;
            }
            if (Character.isDigit(ch)) {
                int val = 0;
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    val = val * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                operands.push(val);
                continue; 
            }
            else if (ch == '(') {
                operators.push(ch);
            }

            else if (ch == ')') {
                while (operators.peek() != '(') {
                    int val2 = operands.pop();
                    int val1 = operands.pop();
                    char op = operators.pop();
                    operands.push(applyOperation(val1, val2, op));
                }
                operators.pop();
            }
            else if (isOperator(ch)) {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    int val2 = operands.pop();
                    int val1 = operands.pop();
                    char op = operators.pop();
                    operands.push(applyOperation(val1, val2, op));
                }
                operators.push(ch);
            }

            i++;
        }

        while (!operators.isEmpty()) {
            int val2 = operands.pop();
            int val1 = operands.pop();
            char op = operators.pop();
            operands.push(applyOperation(val1, val2, op));
        }

        return operands.pop();
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
    public static int applyOperation(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
}
