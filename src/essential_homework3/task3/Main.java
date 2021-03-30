package essential_homework3.task3;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(2000, 200, 2010);
        System.out.println(bmw);

        Ship ship = new Ship(2000, 100, 2018, 5, "Porto");
        System.out.println(ship);

        Plane plane = new Plane(2000, 180, 2019, 10000, 40);
        System.out.println(plane);
    }
}
