package parametrization.methods;

class GenericMethods {
    <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
}
