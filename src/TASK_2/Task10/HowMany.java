package TASK_2.Task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str;
        int count = 0;
        str = scanner.nextLine();
        if(!str.isEmpty()){
            count++;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' ')
                    count++;
            }
        }
        System.out.println("Количество слов: " + count);
    }
}
