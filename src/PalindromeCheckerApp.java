import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("==================================");
        System.out.println("      Palindrome Checker App");
        System.out.println("==================================");
        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome");
        System.out.println();

        // User input
        System.out.print("Enter a sentence or word: ");
        String input = scanner.nextLine();

        // Step 1: Normalize string
        // Remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome using two-pointer logic
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome (ignoring case and spaces).");
        }

        System.out.println("==================================");
        System.out.println("Program finished.");

        scanner.close();
    }
}