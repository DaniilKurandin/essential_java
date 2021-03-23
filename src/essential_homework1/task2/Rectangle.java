package essential_homework1.task2;

import java.util.Scanner;

public class Rectangle {
    double side1;
    double side2;

    double areaCalculator(double side1, double side2) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle: ");
        while (true)
            if (scanner.hasNextDouble()) {
                side1 = scanner.nextDouble();
                if (side1 < 0 || side1 == 0) {
                    System.out.println("Negative number, please repeat: ");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.hasNextLine();
            }

        System.out.println("Enter the length of the rectangle: ");
        while (true)
            if (scanner.hasNextDouble()) {
                side2 = scanner.nextDouble();
                if (side2 < 0 || side2 == 0 || side2 == side1) {
                    System.out.println("Negative number, please repeat: ");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid value entered, please repeat");
                scanner.hasNextLine();
            }

        double area = side1 * side2;
        return area;
    }

    double perimeterCalculator(double side1, double side2) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle: ");
        while (true)
            if (scanner.hasNextDouble()) {
                side1 = scanner.nextDouble();
                if (side1 < 0 || side1 == 0) {
                    System.out.println("Negative number, please repeat: ");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid value entered, please repeat: ");
                scanner.hasNextLine();
            }

        System.out.println("Enter the length of the rectangle: ");
        while (true)
            if (scanner.hasNextDouble()) {
                side2 = scanner.nextDouble();
                if (side2 < 0 || side2 == 0 || side2 == side1) {
                    System.out.println("Negative number, please repeat: ");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid value entered, please repeat");
                scanner.hasNextLine();
            }

        double perimeter = 2 * (side1 + side2);
        return perimeter;
    }
}
