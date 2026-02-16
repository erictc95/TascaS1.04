package nivel1.ejercicio3.indexoutofbounsdexception;

import static org.junit.jupiter.api.Assertions.*;
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
