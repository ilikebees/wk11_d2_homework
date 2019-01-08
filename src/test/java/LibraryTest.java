import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;


    @Before
    public void before() {
        book1 = new Book("I Am Legend", "Richard Matheson", "Science Fiction");
        book2 = new Book("Under The Skin", "Michel Faber", "Science Fiction");
        library = new Library("Edinburgh University");
    }

    @Test
    public void hasName() {
        assertEquals("Edinburgh University", library.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void hasBooks() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canCountBooks() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void cannotAddBookIfLibraryStockFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(5, library.getBookCount());

    }
}