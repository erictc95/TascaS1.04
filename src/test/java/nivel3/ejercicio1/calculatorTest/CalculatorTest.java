package nivel3.ejercicio1.calculatorTest;

import nivel3.ejercicio1.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorTest {

    @Test
    void getTotal_whenCalculatorIsCreated_shouldReturnZero() {
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    void add_whenValueIsAdded_shouldIncreaseTotal() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertThat(calculator.getTotal()).isEqualTo(5);
    }

    @Test
    void subtract_whenValueIsSubtracted_shouldDecreaseTotal() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.subtract(3);
        assertThat(calculator.getTotal()).isEqualTo(2);
    }

    @Test
    void multiply_whenValueIsMultiplied_shouldUpdateTotalCorrectly() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.multiply(10);
        assertThat(calculator.getTotal()).isEqualTo(50);
    }

    @Test
    void divide_whenDividingByZero_shouldThrowArithmeticException() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        assertThatThrownBy(() -> calculator.divide(0)).isInstanceOf(ArithmeticException.class).hasMessage("Cannot divide by zero.");
    }

    @Test
    void divide_whenValueIsValid_shouldReturnCorrectResult() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.divide(2);

        assertThat(calculator.getTotal()).isEqualTo(5);
    }

    @Test
    void reset_whenCalled_shouldSetTotalToZero() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.reset();

        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    void getTotal_whenMultipleOperationsPerformed_shouldReturnCorrectResult() {
        Calculator calculator = new Calculator();

        calculator.add(10);
        calculator.subtract(2);
        calculator.multiply(3);
        calculator.divide(4);

        assertThat(calculator.getTotal()).isEqualTo(6);
    }
}
