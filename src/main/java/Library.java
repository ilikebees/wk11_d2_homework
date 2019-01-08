import java.util.ArrayList;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book>books;

    public Library(String name) {
        this.name = name;
        this.capacity = 5;
        this.books = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (getBookCount() < this.capacity) {
            this.books.add(book);
        }
    }
}
