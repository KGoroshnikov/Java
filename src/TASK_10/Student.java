package TASK_10;

public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private float GPA;

    public Student(String firstName, String lastName, String specialty, float GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.GPA = GPA;
    }

    public double getGPA() {
        return this.GPA;
    }

    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", specialty='" + this.specialty + '\'' +
                ", GPA=" + this.GPA +
                '}';
    }
}
