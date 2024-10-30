import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number of strings
        int n = scanner.nextInt(); // 5
        scanner.nextLine(); // Consume the newline character

        // Read the strings
        String[] words = scanner.nextLine().split(" "); // hello good morning welcome you

        String longestOddLengthWord = null; //

        // Find the longest odd-length word
        for (String word : words) { // hello, good, morning, welcome, you
            if (word.length() % 2 != 0) { // 5%2!=0, 4%2==0, 7%2!=0, 7%2!=0, 3%2!=0
                if (longestOddLengthWord == null || word.length() > longestOddLengthWord.length()) { // null, 7>5, 7!>7, 3!>7
                    longestOddLengthWord = word; // hello, morning
                }
            }
        }

        // Output the result
        if (longestOddLengthWord != null) {
            System.out.println(longestOddLengthWord);
        } else {
            System.out.println("Better luck next time");
        }

        scanner.close();
    }
}