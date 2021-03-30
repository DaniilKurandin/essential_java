package essential_homework3.task3;

public class Car extends Vehicle {

    public Car(int price, int speed, int age) {
        super(price, speed, age);
    }

    @Override
    public String toString() {
        return "Car: " +
                "price = " + price +
                ", speed = " + speed +
                ", age = " + age;
    }
}
