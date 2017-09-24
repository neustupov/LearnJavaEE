import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class BookServiceIT {
    @Test
    public void shouldCheckNumberIsMOCK(){
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        BookService bookService = container.instance().select(BookService.class).get();
        Book book = bookService.createBook("H2G2", 12.50f, "Interesting book");
        assertTrue(book.getNumber().startsWith("MOCK"));
        weld.shutdown();
    }
}
