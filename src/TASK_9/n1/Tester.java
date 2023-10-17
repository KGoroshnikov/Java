package TASK_9.n1;

public class Tester {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "A"),
                new Student(2, "B"),
                new Student(1, "C"),
        };

        System.out.println("Исходный массив:");
        printStudents(students);

        insertionSort(students);

        System.out.println("\nОтсортированный массив по iDNumber:");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}