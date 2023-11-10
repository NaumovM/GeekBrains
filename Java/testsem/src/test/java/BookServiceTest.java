import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import sem4hw.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testFindBookById() {
        String bookId = "123";
        Book expectedBook = new Book("123", "Sample Book", "Sample Author");

        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        Book actualBook = bookService.findBookById(bookId);

        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book 1", "Author 1"),
                new Book("2", "Book 2", "Author 2"),
                new Book("3", "Book 3", "Author 3")
        );

        when(bookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> actualBooks = bookService.findAllBooks();

        assertEquals(expectedBooks, actualBooks);
    }
}
