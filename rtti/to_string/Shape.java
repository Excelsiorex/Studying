package rtti.to_string;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    public abstract String toString();
}
