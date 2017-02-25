package This;


public class Constructors {
    private int i = 0;

    Constructors(int i) {
        this.i = i;
        this.i++;
        System.out.println("Constructor with int parameter, i = " + this.i);
    }

    Constructors(int i, String string) {
        this(i); // вызов конструктора с параметром 'i'
        this.i++;
        System.out.println("Constructor with int and string parameters, i = " + this.i + " , string = " + string);
        System.out.println("END...");
    }
}
