package essential_homework5.task2_3;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> animal = new ArrayList<>();

    void addAnimal() {
        this.animal.add("Собака");
        this.animal.add("Тигр");
        this.animal.add("Бегемот");
        this.animal.add("Лев");
        this.animal.add("Верблюд");
        this.animal.add("Ленивец");
        this.animal.add("Воробей");
        this.animal.add("Дятел");

        System.out.println(animal);
    }

    void removeAnimal() {
        String animal3 = animal.get(3);
        String animal5 = animal.get(5);
        String animal7 = animal.get(7);

        animal.remove(animal3);
        animal.remove(animal5);
        animal.remove(animal7);

        System.out.println(animal);

        System.out.println("Размер списка = " + animal.size());

    }
}

