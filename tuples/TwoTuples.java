package tuples;

public class TwoTuples<A, B> {
    final A first;
    final B second;

    TwoTuples(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Two tuples: (" + first + ", " + second + ")";
    }
}
