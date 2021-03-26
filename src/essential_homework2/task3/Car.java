package essential_homework2.task3;

public class Car {
    int age; // Год
    double speed; // Скорость
    int weight; // Вес автомобиля
    String color; // Цвет

    /* Перегруженные конструкторы */
    public Car() {
    }

    public Car(int age) {
        this.age = age;
    }

    public Car(int age, double speed) {
        this.age = age;
        this.speed = speed;
    }

    public Car(int age, double speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
