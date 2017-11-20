package functional_interfaces.basic;

import java.util.function.BiFunction;

public class CalculatorBasic {
    private int a;
    private int b;

    public CalculatorBasic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(BiFunction<Integer, Integer, Integer> function) {
        return function.apply(a, b);
    }
}
