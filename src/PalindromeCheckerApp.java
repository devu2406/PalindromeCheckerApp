/**
 * Use Case 12 – Strategy Pattern (Stack Based Palindrome)
 *
 * This program demonstrates Stack-based implementation
 * of the PalindromeStrategy interface.
 *
 * @author Developer
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        String input = "Level";

        // Use Stack strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + result);
    }
}

/**
 * PalindromeStrategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * StackStrategy implements PalindromeStrategy
 * Uses Stack (LIFO) logic for palindrome validation
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        // Convert to lowercase for case-insensitive check
        input = input.toLowerCase();

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters of the input string to the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters using the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}