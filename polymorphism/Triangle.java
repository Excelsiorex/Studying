package polymorphism;


class Triangle extends Shape {
    private boolean ifExists;
    private Integer length1, length2, length3;

    Triangle(int length1, int length2, int length3) {
        ifExists = true;
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    void erase() {
        super.erase();
        ifExists = false;
        this.length1 = null;
        this.length2 = null;
        this.length3 = null;
        // Some code
        System.out.println("You've  deleted your triangle");
    }

    @Override
    void draw() {
        super.draw();
        ifExists = true;
        // Some code
        System.out.println("You've deleted your triangle");
    }

    // New method
    void edit() {
        System.out.println("You've edited your triangle");
    }
}
