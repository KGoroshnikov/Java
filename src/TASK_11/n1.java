package TASK_11;

import java.util.Date;

public class n1 {
    public static void main(String[] args) {
        String name = "Горошников";

        Date startDate = new Date(1697609722139L);

        Date endDate = new Date(System.currentTimeMillis());

        System.out.println("Фамилия: " + name);
        System.out.println("Время получения задания: " + startDate);
        System.out.println("Время сдачи задания: " + endDate);
    }
}
