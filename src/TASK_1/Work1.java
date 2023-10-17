package TASK_1;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();

        System.out.println("\nЗадание 2");
        task2();

        System.out.println("\nЗадание 3");
        task3(args);

        System.out.println("\nЗадание 4");
        task4();

        System.out.println("\nЗадание 5");
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(task5(n));
    }

    public static void task1() { // Вычисление суммы и среднего значения чисел
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        System.out.print("Количество чисел: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
            sum += x;
        }
        System.out.println("Сумма:" + sum);
        System.out.println("Среднее:" + (sum / n));
    }

    public static void task2() { // Вычисление суммы, максимума и минимума чисел
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        System.out.print("Количество чисел: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        do {
            int x = scanner.nextInt();
            arr[n - 1] = x;
            sum += x;
            n--;
        } while (n > 0);
        System.out.println("Сумма:" + sum);

        int max = arr[0];
        int min = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
            i++;
        }
        System.out.println("MAX:" + max + " MIN:" + min);
    }

    public static void task3(String[] args) { //Вывод аргументов командной строки
        for (String i : args) {
            System.out.println(i);
        }
    }

    public static void task4() {// Форматированный вывод
        for (int i = 1; i < 11; i++) {
            System.out.println(String.format("%.2f", 1.0 / i)); // Вывод числа с двумя десятичными знаками
        }
    }

    public static int task5(int value) { // Вычисление факториала числа
        int a = 1;
        for (int i = 1; i <= value; i++) {
            a *= i;
        }
        return a;
    }
}
