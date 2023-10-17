package TASK_3.n3;

public class Employee {
    private final String fullname;
    private final int salary;

    Employee(String fullname, int salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public int getSalary() {
        return salary;
    }
}