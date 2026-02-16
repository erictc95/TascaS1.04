package nivel1.ejercicio2.calculatedniletter;

public class CalculateDni {
    private static final String DNI_LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateDniLetter(int numberDni) {
        if (numberDni < 0 || numberDni > 99999999) {
            throw new IllegalArgumentException("The number only can be between 0 and 99999999!");
        }
        return DNI_LETTERS.charAt(numberDni % 23);
    }
}

