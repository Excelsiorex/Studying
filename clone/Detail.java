package clone;

class Detail implements Cloneable {
    private String name;
    private int width;
    private int height;

    Detail(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
