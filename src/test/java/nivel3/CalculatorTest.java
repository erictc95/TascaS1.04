package nivel3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
        calculator.subtract(3);
        assertThat(calculator.getTotal()).isEqualTo(2);
    }
}
