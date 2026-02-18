package nivel3.ejercicio1.calculatorTest;

import nivel3.ejercicio1.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorTest {

    @Test
    void calculatorStartsWithTotalZero() {
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    void calculatorAddsValueCorrectly() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertThat(calculator.getTotal()).isEqualTo(5);
    }

    @Test
    void calculatorSubtractValueCorrectly() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.subtract(3);
        assertThat(calculator.getTotal()).isEqualTo(2);
    }

    @Test
    void calculatorMultiplyValueCorrect() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.multiply(10);
        assertThat(calculator.getTotal()).isEqualTo(50);
    }

    @Test
    void calculatorDivideValueCorrect() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        assertThatThrownBy(() -> calculator.divide(0)).isInstanceOf(ArithmeticException.class).hasMessage("Cannot divide by zero.");
    }
}
