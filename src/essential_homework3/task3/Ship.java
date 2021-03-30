package essential_homework3.task3;

public class Ship extends Vehicle {
    int passengers;
    String port;

    public Ship(int price, int speed, int age, int passengers, String port) {
        super(price, speed, age);
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship: " +
                "passengers = " + passengers +
                ", port = '" + port + '\'' +
                ", price = " + price +
                ", speed = " + speed +
                ", age = " + age;
    }
}
