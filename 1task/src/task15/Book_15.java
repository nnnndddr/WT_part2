package task15;

import task12.Book;

public class Book_15 extends Book implements Comparable<Book_15> {

    private String isbn;

    public Book_15(String title, String author, int price, int edition, String isbn) {
        super(title, author, price, edition);
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Book_15 o) {
        return isbn.compareTo(o.isbn);
    }
}
