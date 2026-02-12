package nivel1.ejercicio1.library;

import org.junit.jupiter.api.Test;
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
}
