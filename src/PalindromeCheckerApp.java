/**
 * Use Case 9 – Recursive Palindrome Checker
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * 1. All characters are matched, OR
 * 2. A mismatch is found.
 *
 * @author Developer
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UCP
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base Case: If start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}