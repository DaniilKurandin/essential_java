package essential_homework6.task2;

import java.util.Scanner;

public class Vehicle {
    public final String ANSI_RESET = "\u001B[0m"; // "граница цвета"

    void printWheelColor() {
        Scanner scanner = new Scanner(System.in);
        Wheel wheel = new Wheel();
        int choose;

        while (true) {
            System.out.println("Choose color wheel\n1 - red\n2 - green\n3 - black");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.nextLine();
                continue;
            }
            choose = scanner.nextInt();

            if (choose <= 0 || choose > 3) {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.nextLine();
                continue;
            }

            break;
        }


        switch (choose) {
            case 1: {
                wheel.color = "\u001B[31m";
                System.out.println("Color wheel = " + wheel.color + "RED" + ANSI_RESET);
                break;
            }
            case 2: {
                wheel.color = "\u001B[32m";
                System.out.println("Color wheel = " + wheel.color + "GREEN" + ANSI_RESET);
                break;
            }
            case 3: {
                wheel.color = "\u001B[30m";
                System.out.println("Color wheel = " + wheel.color + "BLACK" + ANSI_RESET);
                break;
            }
        }
    }

    void printDoorColor() {
        Scanner scanner = new Scanner(System.in);
        Door door = new Door();
        int choose;

        while (true) {
            System.out.println("\nChoose color door\n1 - red\n2 - green\n3 - black");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.nextLine();
                continue;
            }
            choose = scanner.nextInt();

            if (choose <= 0 || choose > 3) {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.nextLine();
                continue;
            }

            break;
        }

        // Выбор операции через switch
        switch (choose) {
            case 1: {
                door.color = "\u001B[31m";
                System.out.println("Color door = " + door.color + "RED" + ANSI_RESET);
                break;
            }
            case 2: {
                door.color = "\u001B[32m";
                System.out.println("Color door = " + door.color + "GREEN" + ANSI_RESET);
                break;
            }
            case 3: {
                door.color = "\u001B[30m";
                System.out.println("Color door = " + door.color + "BLACK" + ANSI_RESET);
                break;
            }
        }
    }

    private class Wheel {
        String color;
    }

    private class Door {
        String color;
    }
}
