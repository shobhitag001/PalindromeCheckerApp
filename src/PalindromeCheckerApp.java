import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Input string
        String input = "radar";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare front and rear until deque size <= 1
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        // Print result
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }
    }
}