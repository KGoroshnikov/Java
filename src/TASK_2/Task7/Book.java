package TASK_2.Task7;

import java.util.Calendar;

public class Book {
    private Calendar creationDate;
    private String author;
    private String name;

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Book{" +
                "Name=" + name +
                ", TASK_1.Task1.Author=" + author +
                ", DateOfCreation=" + creationDate.getTime() +
                "}";
    }

    Book(Calendar date, String name, String author){
        this.creationDate = date;
        this.author = author;
        this.name = name;
    }
}
