import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();


    public void addBook(Book book) {

        books.add(book);

    }

    public void listBooks() {
        for (int i = 0; i < books.size(); i++) {

            System.out.println(books.get(i).toString());

        }
    }

    public void searchByTitle(String title) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println(books.get(i).toString());
            }

        }

    }

    public void borrowBook(int id) {

        for (int i = 0; i < books.size(); i++) {
            if ((books.get(i).getId() == id)) {
                books.get(i).setAvaiable(false);
            }
        }
    }

    public void returnBook(int id) {

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.get(i).setAvaiable(true);
            }
        }

    }

}
