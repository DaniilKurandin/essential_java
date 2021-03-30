package essential_homework3.task3;

public class Plane extends Vehicle {
    double height;
    int passengers;

    public Plane(int price, int speed, int age, double height, int passengers) {
        super(price, speed, age);
        this.height = height;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane: " +
                "height = " + height +
                ", passengers = " + passengers +
                ", price = " + price +
                ", speed = " + speed +
                ", age = " + age;
    }
}
