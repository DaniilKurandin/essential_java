package essential_homework5.task4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Список 10 рандомных значений в диапазоне от 10 - 20 включительно
        for (int i = 0; i < 10; i++) {
            int rand = 9 + (int) (Math.random() * 11 + 1);
            numbers.add(rand);
        }

        System.out.println(numbers);

        // Индекс максимального и минимального значения
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("index max = " + numbers.indexOf(max));
        System.out.println("index min = " + numbers.indexOf(min));

        // Увеличиваем элементы списка на 1
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 1);
        }
        System.out.println(numbers);
    }
}
