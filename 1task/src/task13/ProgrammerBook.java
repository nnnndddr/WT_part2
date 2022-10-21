package task13;

import org.w3c.dom.ls.LSOutput;
import task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, String language, int level) {
        super(title, author, price, edition);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Book:\n title:"+title+"\nauthor"+author+"\nprice"+price+"\nedition"+edition+"\nlanguage"+language+"\nlevel"+level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook book = (ProgrammerBook) o;
        return level == book.level && language.equals(book.language);
    }

    @Override
    public int hashCode() {
        int hash = 31 * title.hashCode();
        hash += 31 * author.hashCode();
        hash += 31 * price;
        hash += 31 * language.hashCode();
        hash += 31 * level;
        return hash;
    }
}
