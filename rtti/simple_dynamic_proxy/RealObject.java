package rtti.simple_dynamic_proxy;

public class RealObject implements Iface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void doSomethingElse(String string) {
        System.out.println("doSomethingElse " + string);
    }
}
