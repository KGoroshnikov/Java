package TASK_3.n1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ListWithFloat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int countOfNumbers = scanner.nextInt();
        Float [] numbers = new Float[countOfNumbers];
        Float [] numbers2 = new Float[countOfNumbers];

        Random rand = new Random();
        System.out.print("Массив 1: ");
        for(int i = 0; i < countOfNumbers;i++) {
            numbers[i] = rand.nextFloat();
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.print("Массив 2: ");
        for(int i = 0; i < countOfNumbers;i++){
            numbers2[i] = (float) Math.random();
            System.out.print(numbers2[i] + " ");
        }

        Arrays.sort(numbers);
        Arrays.sort(numbers2);

        System.out.println("\n\nОтсортированные массивы:");
        System.out.print("Массив 1: ");
        for(int i = 0; i < countOfNumbers; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
        System.out.print("Массив 2: ");
        for(int i = 0; i < countOfNumbers; i++)
            System.out.print(numbers2[i] + " ");

    }
}