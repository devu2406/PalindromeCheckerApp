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
 import java.util.Scanner;

        public class PalindromeCheckerApp {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Input text: ");
                String input = sc.nextLine();

                boolean isPalindrome = true;

                for (int i = 0; i < input.length() / 2; i++) {
                    if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }

                System.out.println("Is it a Palindrome? " + isPalindrome);

                sc.close();
            }
        }
