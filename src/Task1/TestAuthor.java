package Task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Andrew", "", 'M');
        System.out.println(author1.getName());
        author1.setEmail("andrew123@gmail.com");
        System.out.println(author1.getEmail());
        System.out.println(author1.getGender());
        System.out.println(author1.toString());
    }
}
