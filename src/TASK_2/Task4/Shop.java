package TASK_2.Task4;

import java.util.Scanner;
public class Shop {
    private Computer[] pcs;

    public void addPC(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID компьютера: ");
        int new_id = scanner.nextInt();
        System.out.print("Введите CPU компьютера: ");
        String new_cpu = scanner.next();
        System.out.print("Введите GPU компьютера: ");
        String new_gpu = scanner.next();

        for(int i = 0; i < pcs.length; i++){
            if (pcs[i] == null){
                pcs[i] = new Computer(new_id, new_cpu, new_gpu);
                break;
            }
        }
    }

    public void removePC(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID компьютера: ");
        int new_id = scanner.nextInt();

        for(int i = 0; i < pcs.length; i++){
            if (pcs[i].getId() == new_id){
                pcs[i] = null;
                break;
            }
        }
    }

    public Computer findPC(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID компьютера: ");
        int new_id = scanner.nextInt();

        for(int i = 0; i < pcs.length; i++){
            if (pcs[i] != null && pcs[i].getId() == new_id){
                return pcs[i];
            }
        }
        return null;
    }

    Shop(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество компьютеров: ");
        int n = scanner.nextInt();

        this.pcs = new Computer[n];
    }
}
