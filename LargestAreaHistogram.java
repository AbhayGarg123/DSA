
// Largest Rectangle  in Histogram problem
import java.util.*;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bars in histogram: ");
        int n = sc.nextInt();
        int[] heights = new int[n];
        System.out.println("Enter the heights of the bars:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxArea = largestRectangleArea(heights);
        System.out.println("Largest rectangle area in the histogram: " + maxArea);
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
