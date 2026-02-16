package nivel1.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import nivel1.ejercicio3.indexoutofbounsdexception.ArrayTester;
import org.junit.jupiter.api.Test;

public class ArrayTesterTest {
    @Test
    void testAccessInvalidIndexOutOfBoundsException() {
        ArrayTester tester = new ArrayTester();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            tester.accessInvalidIndex();
        });
    }
}
