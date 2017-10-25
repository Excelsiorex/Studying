package clone;

public class Main {
    public static void main(String[] args) {
        Detail detail = new Detail("Wheel", 50, 50);
        Car car = new Car(detail, "Audi", 330);
        Car carClone;
        try {
            carClone = (Car) car.clone();

            System.out.println("Before clone");
            System.out.println(car);
            System.out.println(carClone);

            System.out.println("After clone");
            carClone.setMaxSpeed(400);
            carClone.setName("BMW");
            System.out.println(car);
            System.out.println(carClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
