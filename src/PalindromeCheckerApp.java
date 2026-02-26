/**
 * Use Case 11 – Palindrome Service Class
 *
 * This program uses a separate service class
 * to check whether a string is a palindrome.
 *
 * @author Developer
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for CLI
     */
    public static void main(String[] args) {

        String input = "racecar";

        // Create service object
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}

/**
 * Service class that contains palindrome logic
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome
     * @param input input string
     * @return true if palindrome, otherwise false
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        // Compare characters using two-pointer technique
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
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
