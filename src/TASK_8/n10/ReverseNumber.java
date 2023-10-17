package TASK_8.n10;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число без нулей: ");
        int n = scanner.nextInt();

        int reversedNumber = reverseNumber(n);
        System.out.println("Число в обратном порядке: " + reversedNumber);
    }

    static int reverseNumber(int n) {
        return reverseNumberHelper(n, 0);
    }

    static int reverseNumberHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }

        //System.out.println(n + " " + reversed);

        // Умножаем reversed на 10 и добавляем к последней цифре числа n
        return reverseNumberHelper(n / 10, reversed * 10 + n % 10);
    }
}
