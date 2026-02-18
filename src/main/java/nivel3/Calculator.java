package nivel3;

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
}
