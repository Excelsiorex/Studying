package parametrization.anonymous_inner_generator;

class Teller {
    private static long counter = 1;
    private final long id = counter++;

    // For except using without Generator
    private Teller() {
    }

    @Override
    public String toString() {
        return "Teller " + id;
    }

    static Generator<Teller> generator = () -> new Teller();
}
