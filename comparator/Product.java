package comparator;

class Product {
    private int count;
    private String name;

    Product(int count, String name) {
        this.count = count;
        this.name = name;
    }

    int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
