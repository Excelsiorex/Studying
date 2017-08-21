package rtti.simple_proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("REAL OBJECT");
        consumer(new RealObject());

        System.out.println();

        System.out.println("SIMPLY PROXY");
        consumer(new SimplyProxy(new RealObject()));
    }

    private static void consumer(Iface iface) {
        iface.doSomething();
        iface.doSomethingElse("boo");
    }
}
