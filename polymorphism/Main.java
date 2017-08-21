package polymorphism;


class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(5, 6, 7);

        // Polymorphism
        doSomething(circle);
        doSomething(triangle);
    }

    // Polymorphism
    private static void doSomething(Shape shape) {
        shape.erase();
        shape.draw();
        // shape.edit(); // doesn't work

        // But this works
        if (shape instanceof Circle) {
            ((Circle) shape).edit();
        }
        if (shape instanceof Triangle) {
            ((Triangle) shape).edit();
        }
        // It can be easier (without instanceof), when we add method edit in Shape.class
    }
}
