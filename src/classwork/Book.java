
package classwork;

public class Book {

    private String title;
    private String description;
    private String authorName;
    private double price;
    private String currency;

    public Book(String title, String description, String authorName, double price, String currency) {
        this.title = title;
        this.description = description;
        this.authorName = authorName;
        this.price = price;
        this.currency = currency;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
