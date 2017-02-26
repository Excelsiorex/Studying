package This;

public class Main {
    private static int i = 0;

    public static void main(String[] args) {
        This aThis = new This();
        aThis.increment().increment().increment().increment();
        aThis.print();

        Constructors constructors = new Constructors(i, "apples");

        This a;
    }
}
