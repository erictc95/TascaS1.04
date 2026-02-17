package nivel1.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import nivel1.ejercicio2.calculatedniletter.CalculateDni;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "0, T",
            "2, W",
            "4, G",
            "6, Y",
            "8, P",
            "81726354, V",
            "18273645, F",
            "77777777, B",
            "12873465, C",
            "87126534, G"
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
