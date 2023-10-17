package TASK_7.n4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        System.out.print("Введите радиус окружности: ");
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        System.out.println("Длина: " + math.circleLength(r) + '\n');

        System.out.print("Введите a и b комплексного числа: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println("Модуль: " + math.complexModule(a, b) + '\n');

        System.out.print("Введите число и степень: ");
        a = s.nextDouble();
        b = s.nextDouble();
        System.out.println(math.power(a, b));
    }
}