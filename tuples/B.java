package tuples;

public class B {
    private double defDouble;

    B(double defDouble) {
        this.defDouble = defDouble;
    }

    double getDefDouble() {
        return defDouble;
    }

    void setDefDouble(double defDouble) {
        this.defDouble = defDouble;
    }

    @Override
    public String toString() {
        return String.valueOf(defDouble);
    }
}
