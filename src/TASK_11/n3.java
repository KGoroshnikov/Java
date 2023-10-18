package TASK_11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class n3 {
    private String name;
    private Date birthDate;

    public n3(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getFormattedBirthDate(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + getFormattedBirthDate("dd.MM.yyyy") +
                '}';
    }

    public static void main(String[] args) {
        Date birthDate = new Date(1234567890123L);
        n3 student = new n3("Горошников", birthDate);

        System.out.println(student);

        System.out.println("Дата рождения в формате 'dd.MM.yyyy': \t\t\t\t\t\t\t" + student.getFormattedBirthDate("dd.MM.yyyy"));
        System.out.println("Дата рождения в формате 'E yyyy.MM.dd 'at' hh:mm:ss a zzz': \t" + student.getFormattedBirthDate("E yyyy.MM.dd 'at' hh:mm:ss a zzz"));
        System.out.println("Дата рождения в формате 'EEEE, MMMM d, yyyy': \t\t\t\t\t" + student.getFormattedBirthDate("EEEE, d MMMM, yyyy"));
    }
}
