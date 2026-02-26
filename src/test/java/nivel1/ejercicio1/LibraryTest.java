package nivel1.ejercicio1;

import nivel1.ejercicio1.library.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testAddBook () {

        library.addBook("Pocahontas");

        assertEquals(1, library.getAllBooks().size());
    }

    @Test
    void collectionShouldNotBeNullAfterCreation() {

        assertNotNull(library.getAllBooks());
    }

    @Test
    void correctSizeLaterAddBooks() {

        library.addBook("Bob el manetes");
        library.addBook("El rey Leon");
        library.addBook("Aladin");

        assertEquals(3, library.getAllBooks().size());
    }

    @Test
    void booksInCorrectPosition() {

        library.addBook("Bob el manetes");
        library.addBook("El rey Leon");
        library.addBook("Aladin");

        assertEquals("Bob el manetes", library.getBookForPosition(0));
        assertEquals("El rey Leon", library.getBookForPosition(1));
        assertEquals("Aladin", library.getBookForPosition(2));
    }

    @Test
    void obtainBookForPosition() {

        library.addBook("Bob el manetes");
        library.addBook("El rey Leon");
        library.addBook("Aladin");

        assertNull(library.getBookForPosition(-1));
        assertNull(library.getBookForPosition(5));
    }

    @Test
    void addBookInEspecificPosition() {

        library.addBook("Bob el Manetes");
        library.addBook("El rey Leon");

        //otra manera distinta de comprobar que funciona
        boolean added = library.addBookInPosition(1, "Pocahontas");

        assertTrue(added);
    }

    @Test
    void erasedBook() {

        library.addBook("El rey Leon");
        library.addBook("Aladin");
        library.addBook("Pocahontas");
        library.addBook("El libro de la selva");

        assertTrue(library.eraseBook("Aladin"));
        assertEquals(3, library.getAllBooks().size());
        assertFalse(library.getAllBooks().contains("Aladin"));

    }

    @Test
    void sortedListAndOriginalListNotModified() {

        library.addBook("El rey Leon");
        library.addBook("Aladin");
        library.addBook("Pocahontas");
        library.addBook("El libro de la selva");

        ArrayList<String> original = new ArrayList<>(library.getAllBooks());
        ArrayList<String> sorted = library.getSortedBooks();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Aladin");
        expected.add("El libro de la selva");
        expected.add("El rey Leon");
        expected.add("Pocahontas");

        assertEquals(expected, sorted);
        assertEquals(original, library.getAllBooks());
    }

    @Test
    void duplicatesNotAllowed() {

        boolean firstAdd = library.addBook("Aladin");
        boolean secondAdd = library.addBook("Aladin");

        assertTrue(firstAdd);
        assertFalse(secondAdd);
        assertEquals(1, library.getAllBooks().size());
    }
}
