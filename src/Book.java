public class Book {
    int id;
    String title;
    String author;
    boolean avaiable;


    public Book(int id, String title, String author, boolean avaiable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.avaiable = avaiable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvaiable() {
        return avaiable;
    }

    public void setAvaiable(boolean avaiable) {
        this.avaiable = avaiable;
    }

    public String toString() {

        return "Book ID: " + this.id + " | Title: " + this.title + " | Author: " + this.author + " | Avaiable: " + this.avaiable;
    }

}
