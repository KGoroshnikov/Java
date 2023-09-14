package Task7;

import Task7.Book;

public class BookShelf {
    private Book[] books;
    private int booksAmount;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getBooksAmount() {
        return booksAmount;
    }

    public void setBooksAmount(int booksAmount) {
        this.booksAmount = booksAmount;
    }

    public Book bookGetEarliest(){
        Book earliest = this.books[0];
        for(int i = 0; i < this.booksAmount; i++){
            if (this.books[i].getCreationDate().before(earliest.getCreationDate())){
                earliest = this.books[i];
            }
        }
        return earliest;
    }

    public Book bookGetLatest(){
        Book latest = this.books[0];
        for(int i = 0; i < this.booksAmount; i++){
            if (this.books[i].getCreationDate().after(latest.getCreationDate())){
                latest = this.books[i];
            }
        }
        return latest;
    }

    public void sortBooks(){
        for(int i = 0; i < this.booksAmount; i++){
            for(int j = i + 1; j < this.booksAmount; j++){
                if (this.books[j].getCreationDate().before(this.books[i].getCreationDate())){
                    Book temp = this.books[j];
                    this.books[j] = this.books[i];
                    this.books[i] = temp;
                }
            }
        }
    }
}
