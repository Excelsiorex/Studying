package tuples;

public class A {
    private int defInt;

    A(int defInt) {
        this.defInt = defInt;
    }

    int getDefInt() {
        return defInt;
    }

    void setDefInt(int defInt) {
        this.defInt = defInt;
    }

    @Override
    public String toString() {
        return String.valueOf(defInt);
    }
}
