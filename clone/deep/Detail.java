package clone.deep;

class Detail implements Cloneable {
    String name;
    int width;
    int height;

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
