package polymorpism;


public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(5,6,7);
        doSomething(circle);
        doSomething(triangle);
    }

    // polymorphism here
    private static void doSomething(Shape shape) {
        shape.erase();
        shape.draw();
    }
}
