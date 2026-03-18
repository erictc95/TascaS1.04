package nivel1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import nivel1.ejercicio3.indexoutofboundsexception.ArrayTester;
import org.junit.jupiter.api.Test;

public class ArrayTesterTest {
    @Test
    void accessInvalidIndex_whenCalled_shouldThrowArrayIndexOutOfBoundsException() {
        ArrayTester tester = new ArrayTester();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tester.accessInvalidIndex();
        });
    }
}
