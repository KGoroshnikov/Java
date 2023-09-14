package Task7;

import Task7.Book;
import Task7.BookShelf;

import java.util.GregorianCalendar;

public class BookTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        Book book1 = new Book(new GregorianCalendar(2017, 0 , 25), "Book1", "Andrew");
        Book book2 = new Book(new GregorianCalendar(1900, 12 , 31), "Book2", "Bob");
        Book book3 = new Book(new GregorianCalendar(1532, 7 , 1), "Book3", "Greg");

        Book[] books = new Book[]{book1, book2, book3};
        bookShelf.setBooks(books);
        bookShelf.setBooksAmount(3);
        System.out.println("Earliest: " + bookShelf.bookGetEarliest().toString());
        System.out.println("Latest: " + bookShelf.bookGetLatest().toString());

        System.out.println("\nCurrent Order: ");
        for(int i = 0; i < 3; i++)
            System.out.println(bookShelf.getBooks()[i].toString() + " ");

        bookShelf.sortBooks();

        System.out.println("\nSorted: ");
        for(int i = 0; i < 3; i++)
            System.out.println(bookShelf.getBooks()[i].toString() + " ");
    }
}
