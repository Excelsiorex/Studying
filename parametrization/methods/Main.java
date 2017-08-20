package parametrization.methods;

public class Main {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(gm);
        gm.f(50);
        gm.f(100.0);
        gm.f(10L);
        gm.f(10.5F);
    }
}
