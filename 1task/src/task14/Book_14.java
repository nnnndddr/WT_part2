package task14;

import task12.Book;

public class Book_14 extends Book implements Cloneable {
    public Book_14(String title, String author, int price, int edition) {
        super(title, author, price, edition);
    }
    @Override
    public Object clone() {
        return new Book_14(title, author, price, edition);
    }
}
