package Task4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        while (true){
            System.out.println("Выберите НОМЕР действия:");
            System.out.println("1. Добавить ПК");
            System.out.println("2. Удалить ПК");
            System.out.println("3. Найти ПК по ID");
            System.out.println("4. Выход");

            int n;
            n = scanner.nextInt();

            if (n == 1) shop.addPC();
            else if (n == 2) shop.removePC();
            else if (n == 3) {
                Computer pc = shop.findPC();
                if (pc != null) System.out.println(pc.toString());
            }
            else break;

            scanner.nextLine();
        }
    }
}
