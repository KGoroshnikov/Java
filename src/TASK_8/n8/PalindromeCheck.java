package TASK_8.n8;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isPalindrome(String word) {
        int length = word.length();

        if (length <= 1) {
            return true;
        }

        if (word.charAt(0) != word.charAt(length - 1)) {
            return false;
        }

        return isPalindrome(word.substring(1, length - 1));
    }
}
