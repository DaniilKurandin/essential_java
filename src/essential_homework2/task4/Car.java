package essential_homework2.task4;

public class Car {
    int age; // Год
    double speed; // Скорость
    int weight; // Вес автомобиля
    String color; // Цвет

    /* Конструкторы из конструкторов */
    public Car() {
        this(2007);
    }

    public Car(int age) {
        this(2007,200);
    }

    public Car(int age, double speed) {
        this(2007,200,2000);
    }

    public Car(int age, double speed, int weight) {
        this(2007,200,2000,"Black");
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
