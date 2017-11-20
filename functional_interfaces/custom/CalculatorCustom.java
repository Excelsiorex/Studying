package functional_interfaces.custom;

public class CalculatorCustom {
    private int a;
    private int b;

    public CalculatorCustom(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(Calculate calculate) {
        return calculate.sum(a, b);
    }
}
