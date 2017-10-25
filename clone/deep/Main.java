package clone.deep;

public class Main {
    public static void main(String[] args) {
        Detail detail = new Detail("Wheel", 50, 50);
        Car car = new Car(detail, "Audi", 330);
        Car carClone;
        try {
            carClone = car.clone();

            System.out.println("Before changes");
            System.out.println(car);
            System.out.println(carClone);
            System.out.println("Detail: " + car.name + " " + car.maxSpeed);
            System.out.println("Detail clone: " + carClone.name + " " + carClone.maxSpeed);

            carClone.maxSpeed = 300;
            carClone.name = "Dima";

            System.out.println("After changes");
            System.out.println(car);
            System.out.println(carClone);
            System.out.println("Detail: " + car.name + " " + car.maxSpeed);
            System.out.println("Detail clone: " + carClone.name + " " + carClone.maxSpeed);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
