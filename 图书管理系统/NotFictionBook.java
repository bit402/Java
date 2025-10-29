package test;

public class NotFictionBook extends Book {
    private String topic;

    @Override
    public String toString() {
        return "NonFictionBook{" +
                "name='" + getName() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ", isbn='" + getIsbn() + '\'' +
                ", topic='" + topic + '\'' +
                ", status=" + isStatus() +
                '}';
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public NotFictionBook(String name, String author, double price, String isbn, String topic) {
        super(name, author, price, isbn);
        this.topic = topic;
    }
}
