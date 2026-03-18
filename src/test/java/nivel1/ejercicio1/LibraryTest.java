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
    void addBook_whenBookIsAdded_shouldIncreaseSize() {

        library.addBook("Pocahontas");

        assertEquals(1, library.getAllBooks().size());
    }

    @Test
    void getAllBooks_whenLibraryCreated_shouldNotBeNull() {

        assertNotNull(library.getAllBooks());
    }

    @Test
    void addBooks_whenMultipleBooksAdded_shouldReturnCorrectSize() {

        library.addBook("Bob el manetes");
        library.addBook("El rey Leon");
        library.addBook("Aladin");

        assertEquals(3, library.getAllBooks().size());
    }

    @Test
    void getBookAt_whenPositionIsValid_shouldReturnCorrectBook() {

        library.addBook("Bob el manetes");
        library.addBook("El rey Leon");
        library.addBook("Aladin");

        assertEquals("Bob el manetes", library.getBookAt(0));
        assertEquals("El rey Leon", library.getBookAt(1));
        assertEquals("Aladin", library.getBookAt(2));
    }

    @Test
    void getBookAt_whenPositionIsInvalid_shouldReturnNull() {

        library.addBook("Bob el manetes");
        library.addBook("El rey Leon");
        library.addBook("Aladin");

        assertNull(library.getBookAt(-1));
        assertNull(library.getBookAt(5));
    }

    @Test
    void addBookAt_whenPositionIsValid_shouldInsertBook() {

        library.addBook("Bob el Manetes");
        library.addBook("El rey Leon");

        boolean added = library.addBookAt(1, "Pocahontas");

        assertTrue(added);
    }

    @Test
    void removeBook_whenBookExists_shouldRemoveBook() {

        library.addBook("El rey Leon");
        library.addBook("Aladin");
        library.addBook("Pocahontas");
        library.addBook("El libro de la selva");

        assertTrue(library.removeBook("Aladin"));
        assertEquals(3, library.getAllBooks().size());
        assertFalse(library.getAllBooks().contains("Aladin"));

    }

    @Test
    void getSortedBooks_whenCalled_shouldReturnSortedListWithoutModifyingOriginal() {

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
    void addBook_whenDuplicate_shouldNotBeAdded() {

        boolean firstAdd = library.addBook("Aladin");
        boolean secondAdd = library.addBook("Aladin");

        assertTrue(firstAdd);
        assertFalse(secondAdd);
        assertEquals(1, library.getAllBooks().size());
    }
}
