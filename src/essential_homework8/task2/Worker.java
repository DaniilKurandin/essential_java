package essential_homework8.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Worker {
    String name;
    String post;
    int year;

    public Worker() {
    }

    public Worker(String name, String post, int year) {
        this.name = name;
        this.post = post;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getYear() {
        return year;
    }

    void worker() {
        Scanner scanner = new Scanner(System.in);

        Worker[] workers = new Worker[5];

        while (true) {
            try {
                System.out.println("Введите ФИО, должность, год работников");
                for (int i = 0, j = 1; i < workers.length; i++) {
                    System.out.println("Работник " + j++);
                    workers[i] = new Worker(scanner.next(), scanner.next(), scanner.nextInt());
                }

                Comparator<Worker> comparator = Comparator.comparing(Worker::getName);

                Arrays.sort(workers, comparator);

                for (Worker work : workers) {
                    System.out.println("Name = " + work.getName() + ", Post = " + work.getPost() + ", Year = " + work.getYear());
                }
                break;

            } catch (InputMismatchException e) {
                System.err.println("Неверный формат\n");
            }
        }

    }
}
