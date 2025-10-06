# Difference Between Objects and Classes in Java

## 📘 Project Overview

This Java project demonstrates the fundamental difference between **classes** and **objects**, using a simple example of a `Car` class. The code and explanation follow the principles from *Big Java: Late Objects* (2nd ed.) by Cay Horstmann.

---

## 💡 Understanding Classes and Objects

- A **class** is a blueprint that defines the structure (fields) and behavior (methods) of something.
- An **object** is an actual instance created based on that class. It holds real values and performs actions.

> Example: A `Car` class defines what a car is (color, speed), but each car you create in your program (like `car1`, `car2`) is an object with specific values.

---

## 🛠️ How I Built This in Eclipse

### Step-by-Step:

1. Open Eclipse IDE.
2. Go to `File → New → Java Project`.
3. Name the project: `Difference-Objects-Classes`.
4. Right-click `src` → `New → Class`.
5. Name the class: `CarDemo`, and check the box for `public static void main`.
6. Paste the Java code below into the `CarDemo.java` file.
7. Save and run the program.

---

## 🧾 Java Code

```java
// Class definition (blueprint)
class Car {
    String color;
    int speed;

    // Method to display car details
    void displayDetails() {
        System.out.println("Color: " + color + ", Speed: " + speed + " mph");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Creating two Car objects (instances)
        Car car1 = new Car();
        car1.color = "Black";
        car1.speed = 65;

        Car car2 = new Car();
        car2.color = "Yellow";
        car2.speed = 80;

        // Display details
        car1.displayDetails();
        car2.displayDetails();
    }
}
