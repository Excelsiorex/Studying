package tuples;

public class C {
    private boolean defBool;

    C(boolean defBool) {
        this.defBool = defBool;
    }

    boolean getDefBool() {
        return defBool;
    }

    void setDefBool(boolean defBool) {
        this.defBool = defBool;
    }

    @Override
    public String toString() {
        return String.valueOf(defBool);
    }
}
