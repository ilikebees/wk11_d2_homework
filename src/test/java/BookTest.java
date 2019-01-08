import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Enders Game", "Orson Scott Card", "Science Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("Enders Game", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Orson Scott Card", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Science Fiction", book.getGenre());
    }
}
