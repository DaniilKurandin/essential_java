package essential_homework4.task3;

import java.util.Scanner;

public class Player implements Playable, Recordable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void play() {
        System.out.println("Играет мелодия\n2 - Пауза\n3 - Запись\n4 - Стоп\n0 - Выход");
    }

    @Override
    public void record() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignore) {
            }
        }

        System.out.println("Пехали!\n2 - Пауза\n4 - Стоп\n0 - Выход");
    }

    @Override
    public void pause() {
        System.out.println("Пауза\n1 - Воспроизвести\n3 - Запись\n4 - Стоп\n0 - Выход");
    }

    @Override
    public void stop() {
        System.out.println("Стоп\n1 - Воспроизвести\n2 - Пауза\n3 - Запись\n0 - Выход");
    }

    void Play() {
        System.out.println("1 - Воспроизвести\n2 - Пауза\n3 - Запись\n4 - Стоп\n0 - Выход");

        int choose;
        do {
            choose = scanner.nextInt();

            switch (choose) {
                case 1: {
                    play();
                    break;
                }
                case 2: {
                    pause();
                    break;
                }
                case 3: {
                    record();
                    break;
                }
                case 4: {
                    stop();
                    break;
                }
                case 0: {
                    System.out.println("Выход");
                    break;
                }
            }
        } while (choose > 0);

    }
}


