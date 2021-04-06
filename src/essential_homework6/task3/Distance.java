package essential_homework6.task3;

import java.util.Scanner;

public class Distance {
    double distance;

    void print() {
        Scanner sc = new Scanner(System.in);
        int choose;

        while (true) {
            System.out.println("1 - millimeter to centimeter\n2 - centimeter to decimeter\n3 - decimeter to metre\n4 - metre to kilometre");

            // проверка ввода и границы выбора
            if (!sc.hasNextInt()) {
                System.out.println("Invalid value entered, please repeat: ");
                sc.nextLine();
                continue;
            }
            choose = sc.nextInt();

            if (choose <= 0 || choose > 4) {
                System.out.println("Choose number operation");
                continue;
            }

            break;
        }


        while (true) {
            System.out.println("Enter number: ");

            // проверки ввода, отрицательного значения и проверка на 0
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid value entered, please repeat: ");
                sc.nextLine();
                continue;
            }
            this.distance = sc.nextDouble();

            if (distance < 0 || distance == 0) {
                System.out.println("Invalid value entered, please repeat: ");
                sc.nextLine();
                continue;
            }

            break;
        }

        // Выбор операции через switch
        switch (choose) {
            case 1: {
                System.out.println(distance + "мм = " + Converter.millimeterToCentimeter(distance) + "см");
                break;
            }
            case 2: {
                System.out.println(distance + "см = " + Converter.centimeterToDecimeter(distance) + "дцм");
                break;
            }
            case 3: {
                System.out.println(distance + "дцм = " + Converter.decimeterToMetre(distance) + "м");
                break;
            }
            case 4: {
                System.out.println(distance + "м = " + Converter.metreToKilometer(distance) + "км");
                break;
            }
        }
    }


    static class Converter {
        // миллиметры в сантиметры
        static double millimeterToCentimeter(double millimeter) {
            return millimeter / 10;
        }

        // сантиметры в дециметры
        static double centimeterToDecimeter(double centimeter) {
            return centimeter / 10;
        }

        // дециметры в метры
        static double decimeterToMetre(double decimeter) {
            return decimeter / 10;
        }

        // метры в километры
        static double metreToKilometer(double meter) {
            return meter / 1000;
        }


    }
}
