/**
 * Use Case 13 – Performance Comparison
 *
 * This class compares execution performance
 * of palindrome validation using a Stack strategy.
 *
 * It:
 * 1. Captures execution start time
 * 2. Executes palindrome logic
 * 3. Captures end time
 * 4. Calculates total execution duration
 *
 * @version 15.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        String input = "Level";

        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time (nanoseconds)
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
        System.out.println("Execution Time: " + executionTime);
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based implementation
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        input = input.toLowerCase();

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}