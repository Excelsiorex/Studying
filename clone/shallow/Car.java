package clone.shallow;

class Car implements Cloneable {
    Detail detail;
    String name;
    int maxSpeed;

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
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
