package rtti.simple_dynamic_proxy;


import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("REAL OBJECT");
        RealObject realObject = new RealObject();
        consumer(realObject);

        System.out.println();

        System.out.println("SIMPLE DYNAMIC PROXY");
        Iface proxy = (Iface) Proxy.newProxyInstance(
                Iface.class.getClassLoader(),
                new Class[]{Iface.class},
                new DynamicProxyHandler(realObject));
        consumer(proxy);
    }

    private static void consumer(Iface iface) {
        iface.doSomething();
        iface.doSomethingElse("Boo!");
    }
}
