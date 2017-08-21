package polymorphism;


class Circle extends Shape {
    private boolean isExists;
    private Integer radius;

    Circle(int radius) {
        isExists = true;
        this.radius = radius;
    }

    @Override
    void erase() {
        super.erase();
        isExists = false;
        radius = null;
        // Some code
        System.out.println("You've deleted your circle");
    }

    @Override
    void draw() {
        super.draw();
        isExists = true;
        // Some code
        System.out.println("You've deleted your circle");
    }

    void edit() {
        System.out.println("You've edited your circle");
    }
}
