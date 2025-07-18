// stock span problem
import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int[] span = calculateSpan(prices);
        System.out.println("Stock Span:");
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        span[0] = 1; 
        stack.push(0); 

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }

        return span;
    }
}
