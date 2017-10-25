package clone;

class Car implements Cloneable {
    private Detail detail;
    private String name;
    private int maxSpeed;

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car(Detail detail, String name, int maxSpeed) {
        this.detail = detail;
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "detail=" + detail +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
