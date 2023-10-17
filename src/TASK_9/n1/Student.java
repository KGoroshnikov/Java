package TASK_9.n1;

public class Student implements Comparable<Student> {
    private int idNumber;
    private String name;

    public Student(int idNumber, String name){
        this.idNumber = idNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{name:" + this.name +
                ", idNumber:" + this.idNumber + "}";
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.idNumber, otherStudent.idNumber);
    }
}
