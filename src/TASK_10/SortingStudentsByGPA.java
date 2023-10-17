package TASK_10;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private Student[] students;

    public SortingStudentsByGPA(int size) {
        students = new Student[size];
    }

    public void setArray(Student[] students) {
        this.students = students;
    }

    public void quickSortByGPA() {
        Arrays.sort(students, Comparator.comparing(Student::getGPA).reversed());
    }

    public void sortByField(Comparator<Student> comparator) {
        Arrays.sort(students, comparator);
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA(3);
        Comparator<Student> mycomp = new
                StudentGPAComparator().thenComparing(new
                StudentNameComparator());

        Student[] students = {
                    new Student("Bob", "Smith", "Engineer", 1.23f),
                new Student("CLONE OF Alice", "Smith", "Worker", 3.0f),
                new Student("Alice", "Smith", "Worker", 3.0f),
                new Student("Tom", "Smith", "Teacher", 3.56f),
        };

        sorter.setArray(students);

        System.out.println("Исходный массив:");
        sorter.outArray();

        sorter.quickSortByGPA();
        System.out.println("\nОтсортированный массив по среднему баллу (GPA):");
        sorter.outArray();

        sorter.sortByField(Comparator.comparing(Student::getFirstName));
        System.out.println("\nОтсортированный массив по имени:");
        sorter.outArray();

        Arrays.sort(students, mycomp);
        System.out.println("\nОтсортированный массив по моему компаратору:");
        sorter.outArray();
    }
}