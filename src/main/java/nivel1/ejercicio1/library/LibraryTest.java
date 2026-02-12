package nivel1.ejercicio1.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    void testAddBook () {
        Library library = new Library();

        library.addBook("Pocahontas");

        assertEquals(1, library.getAllBooks().size());
    }

    @Test
    void collectionShouldNotBeNullAfterCreation() {
        Library library = new Library();

        assertNotNull(library.getAllBooks());
    }
}
