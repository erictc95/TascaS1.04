package nivel1.ejercicio2.calculatedniletter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "0, T",
            "2, W",
            "4, G",
            "6, M",
            "8, F",
            "81726354, S",
            "18273645, A",
            "77777777, W",
            "12873465, K",
            "87126534, H"
    })

    void testCalculateDniLetterValid(int numberDni, char expectedLetter) {
        char actualLetter = CalculateDni.calculateDniLetter(numberDni);
        assertEquals(expectedLetter, actualLetter, "The letter calculated is incorrect for DNI number: " + numberDni);
    }

    @Test
    void testCalculateLetterNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculateDni.calculateDniLetter(-1);
        });
    }

    @Test
    void testCalculateLetterNumberTooLarge () {
        assertThrows(IllegalArgumentException.class, () -> {
           CalculateDni.calculateDniLetter(123456789);
        });
    }

}
