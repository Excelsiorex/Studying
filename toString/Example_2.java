package toString;


class Example_2 {
    private int a;
    private double b;
    private String s;
    private Example_1 example1;

    Example_2() {
        a = 100;
        b = 200;
        s = "Default String";
        example1 = new Example_1(s);
    }

    Example_2(int a, double b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
        example1 = new Example_1(s);
    }

    @Override
    public String toString() {
        return "a = " + a + "\n" +
                "b = " + b + "\n" +
                "example1 = " + example1;
    }
}
