package polymorpism;


public class Circle extends Shape {
    private boolean isExists;
    private Integer radius;

    Circle(int radius) {
        isExists = true;
        this.radius = radius;
    }

    @Override
    public void erase() {
        super.erase();
        isExists = false;
        radius = null;
        // тут еще код
        System.out.println("Вы удалили свой КРУГ (возможно)");
    }

    @Override
    public void draw() {
        super.draw();
        isExists = true;
        // тут еще код
        System.out.println("Вы создали новый КРУГ (возможно)");
    }

    // new method
    public void edit() {
        System.out.println("Вы отредактировали КРУГ (возможно)");
    }
}
