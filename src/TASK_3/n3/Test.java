package TASK_3.n3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Employee first = new Employee("Elon Musk", 10000);
        Employee second = new Employee("Bobby Smith", 200000);
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(first);
        list.add(second);
        Report.generate_Report(list);
    }
}