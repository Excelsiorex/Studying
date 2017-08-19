package tuples;

public class ThreeTuples<A, B, C> extends TwoTuples<A, B> {
    private final C third;

    ThreeTuples(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "Three typles: (" + first + ", " + second + ", " + third + ")";
    }
}
