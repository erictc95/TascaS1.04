package nivel3.ejercicio1.calculator;

public class Calculator {
    private double total;

    public Calculator() {
        this.total = 0.0;
    }

    public double getTotal() {
        return total;
    }

    public void add(double value) {
        total += value;
    }

    public void subtract(double value) {
        total -= value;
    }

    public void multiply(double value) {
        total *= value;
    }

    public void divide(double value) {
        if (value == 0) {
            //Throw exception if attempting to divide by zero.
            throw new ArithmeticException("Cannot divide by zero");
        }
        total /= value;
    }

    public void reset() {
        total = 0;
    }
}
