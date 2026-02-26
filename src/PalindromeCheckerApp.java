

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize the string:
        // Remove non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
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
