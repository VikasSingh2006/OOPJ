class VehicleT {
    protected String brand;
    protected int speed;
    
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}
class Car extends car {
    private int numberOfDoors;
    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);

        this.numberOfDoors = numberOfDoors;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
public class VehicleTest
 {

    public static void main(String[] args) {

        Car c = new Car("Toyota", 180, 4);

        c.display();
    }
}
