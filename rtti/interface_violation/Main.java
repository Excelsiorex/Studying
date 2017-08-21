package rtti.interface_violation;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // mistake
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b = (B) a;
            b.g();
        }
    }
}
