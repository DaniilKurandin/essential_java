package essential_homework1.task2;

import java.util.Scanner;

/** БЕЗ ВЛОЖЕННЫХ if с continue **/

public class Rectangle1 {
    double side1;
    double side2;

    double areaCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle: ");
        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.nextLine();
                continue;
            }

            this.side1 = scanner.nextDouble();

            if (side1 < 0 || side1 == 0) {
                System.out.println("Negative number, please repeat: ");
                scanner.nextLine();
                continue;
            }

            break;
        }

        System.out.println("Enter the length of the rectangle:");

        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.nextLine();
                continue;
            }

            this.side2 = scanner.nextDouble();

            if (side2 < 0 || side2 == 0) {
                System.out.println("Negative number, please repeat: ");
                scanner.nextLine();
                continue;
            }

            break;
        }

        return side1 * side2;
    }

    double perimeterCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle: ");
        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.nextLine();
                continue;
            }

            this.side1 = scanner.nextDouble();

            if (side1 < 0 || side1 == 0) {
                System.out.println("Negative number, please repeat: ");
                scanner.nextLine();
                continue;
            }

            break;
        }

        System.out.println("Enter the length of the rectangle:");

        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.nextLine();
                continue;
            }

            this.side2 = scanner.nextDouble();

            if (side2 < 0 || side2 == 0) {
                System.out.println("Negative number, please repeat: ");
                scanner.nextLine();
                continue;
            }

            break;
        }

        return 2 * (side1 + side2);
    }
}

