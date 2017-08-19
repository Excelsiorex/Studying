package rtti.simple_proxy;

public class SimplyProxy implements Iface {
    private Iface proxied;

    SimplyProxy(Iface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void doSomethingElse(String string) {
        System.out.println("SimpleProxy doSomethingElse " + string);
        proxied.doSomethingElse(string);
    }
}
