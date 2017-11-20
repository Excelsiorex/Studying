package functional_interfaces;

import functional_interfaces.basic.CalculatorBasic;
import functional_interfaces.custom.CalculatorCustom;

public class Main {
    public static void main(String[] args) {
        System.out.println(new CalculatorCustom(4, 60).sum((x, y) -> (x + y)));
        System.out.println(new CalculatorBasic(4, 60).sum((x, y) -> (x + y)));
    }
}
