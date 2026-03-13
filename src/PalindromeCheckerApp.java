import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Using Reverse String
    public static boolean palindromeUsingReverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    // Method 2: Using Two Pointer Technique
    public static boolean palindromeUsingTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Using StringBuilder Reverse
    public static boolean palindromeUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Palindrome Checker App - UC13 Performance Comparison");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove spaces and ignore case
        input = input.replaceAll("\\s+", "").toLowerCase();

        long start, end;

        // -------- Method 1 --------
        start = System.nanoTime();
        boolean result1 = palindromeUsingReverse(input);
        end = System.nanoTime();
        long time1 = end - start;

        // -------- Method 2 --------
        start = System.nanoTime();
        boolean result2 = palindromeUsingTwoPointer(input);
        end = System.nanoTime();
        long time2 = end - start;

        // -------- Method 3 --------
        start = System.nanoTime();
        boolean result3 = palindromeUsingStringBuilder(input);
        end = System.nanoTime();
        long time3 = end - start;

        // -------- Results --------
        System.out.println("\nResults:");
        System.out.println("Reverse Method Result: " + result1 +
                " | Time: " + time1 + " ns");

        System.out.println("Two Pointer Method Result: " + result2 +
                " | Time: " + time2 + " ns");

        System.out.println("StringBuilder Method Result: " + result3 +
                " | Time: " + time3 + " ns");

        sc.close();
    }
}