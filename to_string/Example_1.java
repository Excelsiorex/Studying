package toString;


class Example_1 {
    private String s;

    Example_1() {
        s = "Default String";
    }

    Example_1(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
