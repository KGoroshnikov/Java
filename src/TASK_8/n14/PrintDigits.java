package TASK_8.n14;
import java.util.Scanner;

public class PrintDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int n = scanner.nextInt();

        System.out.println("Цифры числа " + n + " по одной:");
        printDigits(n);
    }

    static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }

        printDigits(n / 10);

        System.out.println(n % 10);
    }
}
