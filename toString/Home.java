package toString;


class Home {
    private int a;
    private double b;
    private Door door = new Door();

    @Override
    public String toString() {
        return "a = " + a + "\n" +
                "b = " + b + "\n" +
                "door = " + door;
    }
}
