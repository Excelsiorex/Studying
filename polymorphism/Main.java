package polymorphism;


class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(5,6,7);

        // восходящее преобразование
        doSomething(circle);
        doSomething(triangle);
    }

    // полиморфизм тут (восходящее преобразование)
    private static void doSomething(Shape shape) {
        shape.erase();
        shape.draw();
        // shape.edit(); // не работает
    }
}
