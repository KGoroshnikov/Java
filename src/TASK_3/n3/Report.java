package TASK_3.n3;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Report {
    public static void generate_Report(ArrayList<Employee>employees){
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        System.out.printf("%-20s %s %n", "Имя сотрудника", "Зарплата");
        for(Employee employee:employees){
            String formattedSalary = decimalFormat.format(employee.getSalary());
            System.out.printf("%-20s %s руб.%n", employee.getFullname(), formattedSalary);
        }
    }
}