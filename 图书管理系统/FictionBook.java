package test;

public class FictionBook extends Book {
    private String level;

    @Override
    public String toString() {
        return "FictionBook{" +
                "name='" + getName() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ", isbn='" + getIsbn() + '\'' +
                ", level='" + level + '\'' +
                ", status=" + isStatus() +
                '}';
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public FictionBook(String name, String author, double price, String isbn, String level) {
        super(name, author, price, isbn);
        this.level = level;
    }

}
