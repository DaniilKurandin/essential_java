package essential_homework10.dop_task;


import java.util.Arrays;

public class ArrayList<T> {
    private Object[] array;
    private int index = 0;
    private static final Object[] EMPTY = {};
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList() {
        this.array = EMPTY;
    }

    public ArrayList(int capacity) { // Свой размер массива
        if (capacity > 0) {
            this.array = new Object[DEFAULT_CAPACITY];
        } else if (capacity == 0) {
            this.array = EMPTY;
        } else {
            throw new IllegalArgumentException("uncorrected length: " +
                    capacity);
        }
    }


    void add(T value) { // Добавление элемента в список
        if (index == array.length) {
            grow();
        }

        array[index] = value;
        index++;
    }

    Object get(int index) { // Возвращает элемент по индексу из списка
        if (index < 0 || index > this.index) {
            exception();
        }

        return array[index];
    }

    void exception() { // Ошибка
        throw new IndexOutOfBoundsException("out of bound " + index);
    }

    int size() { // Размер массива
        return index;
    }

    private void grow() { // Увеличиваем размер массива в 2 раза
        array = Arrays.copyOf(array, array.length * 2);
    }

    void set(int index, T value) { // Заменяем элемент по индексу на свой элемент
        if (index < 0 || array.length < index) {
            exception();
        }

        array[index] = value;
    }

    @Override
    public String toString() { // Вывод в консоль
        return Arrays.toString(array);
    }

    void clear() { // Очистка массива
        array = new Object[0];
    }

    boolean isEmpty() { // Проверяем, есть ли элементы в массиве
        if (array.length == 0) {
            return true;
        }

        return false;
    }

    int indexOf(T value) { // Возвращаем индекс искомого элемента
        for (int i = 1; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

//    void remove(int index) {
//        for (int i = 0; i < array.length; i++) {
//            if ()
//        }
//    }
}


