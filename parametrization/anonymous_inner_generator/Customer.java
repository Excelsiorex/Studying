package parametrization.anonymous_inner_generator;

public class Customer {
    private static long counter = 1;
    private final long id = counter++;

    // For except using without Generator
    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer " + id;
    }

    static Generator<Customer> customer = () -> new Customer();
}
