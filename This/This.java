package This;


public class This {
    private int i = 0;

    This increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }
}
