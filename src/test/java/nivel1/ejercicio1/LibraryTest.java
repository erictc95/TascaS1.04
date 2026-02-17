package nivel1.ejercicio1;

import nivel1.ejercicio1.library.Library;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    void testAddBook () {
        //Arrange
        Library library = new Library();
        //Act
        library.addBook("Pocahontas");
        //Assert
        assertEquals(1, library.getAllBooks().size());
    }

    @Test
    void collectionShouldNotBeNullAfterCreation() {
        Library library = new Library();

        assertNotNull(library.getAllBooks());
    }

    @Test
    void correctSizeLaterAddBooks() {
        Library library = new Library();

        library.addBook("Bob el manetes");
        library.addBook("El rey Leon");
        library.addBook("Aladin");

        assertEquals(3, library.getAllBooks().size());
    }

    @Test
    void booksInCorrectPosition() {
        Library library = new Library();

        library.addBook("Bob el manetes");
        library.addBook("El rey Leon");
        library.addBook("Aladin");

        assertEquals("Bob el manetes", library.getBookForPosition(0));
        assertEquals("El rey Leon", library.getBookForPosition(1));
        assertEquals("Aladin", library.getBookForPosition(2));
    }

    @Test
    void obtainBookForPosition() {
        Library library = new Library();

        library.addBook("Bob el manetes");
        library.addBook("El rey Leon");
        library.addBook("Aladin");

        assertNull(library.getBookForPosition(1));
        assertNull(library.getBookForPosition(5));
    }

    @Test
    void addBookInEspecificPosition() {
        Library library = new Library();

        library.addBook("Bob el Manetes");
        library.addBook("El rey Leon");

        //otra manera distinta de comprobar que funciona
        boolean added = library.addBookInPosition(1, "Pocahontas");

        assertTrue(added);
    }

    @Test
    void erasedBook() {
        Library library = new Library();
        library.addBook("El rey Leon");
        library.addBook("Aladin");
        library.addBook("Pocahontas");
        library.addBook("El libro de la selva");

        library.eraseBook("Aladin");

        assertEquals(3, library.getAllBooks().size());
        assertFalse(library.getAllBooks().contains("Aladin"));
        assertTrue(library.eraseBook("Aladin"));
    }

    @Test
    void sortedListAndOriginalListNotModified() {
        Library library = new Library();
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
        Library library = new Library();

        boolean firstAdd = library.addBook("Aladin");
        boolean secondAdd = library.addBook("Aladin");

        assertTrue(firstAdd);
        assertFalse(secondAdd);
        assertEquals(1, library.getAllBooks().size());
    }
}
