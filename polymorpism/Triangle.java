package polymorpism;


public class Triangle extends Shape {
    private boolean ifExists;
    private Integer length1, length2, length3;

    Triangle(int length1, int length2, int length3) {
        ifExists = true;
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public void erase() {
        super.erase();
        ifExists = false;
        this.length1 = null;
        this.length2 = null;
        this.length3 = null;
        // тут еще код
        System.out.println("Вы удалили свой ТРЕУГОЛЬНИК (возможно)");
    }

    @Override
    public void draw() {
        super.draw();
        ifExists = true;
        // тут еще код
        System.out.println("Вы создали новый ТРЕУГОЛЬНИК (возможно)");
    }

    /**
     * Приватный метод не может быть переобпределён
     */
    /*@Override
    private void put() {
        System.out.println("Вызов в обобщённом классе");
    }*/

    // new method
    public void edit() {
        System.out.println("Вы отредактировали ТРЕУГОЛЬНИК (возможно)");
    }
}
