package TASK_10;
import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.getGPA(), student2.getGPA());
    }
}
