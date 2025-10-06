// Class definition (blueprint)
class Car {
    String color;
    int speed;

    // Method to describe the car
    void displayDetails() {
        System.out.println("Color: " + color + ", Speed: " + speed + " mph");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Creating objects (instances of the class)
        Car car1 = new Car(); 
        car1.color = "Black";
        car1.speed = 65;

        Car car2 = new Car();
        car2.color = "Yellow";
        car2.speed = 80;

        // Display details using object methods
        car1.displayDetails();
        car2.displayDetails();
    }
}