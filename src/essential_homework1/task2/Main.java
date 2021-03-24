package essential_homework1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Select an operation: \"1\" - rectangle area, \"2\" - rectangle perimeter");
        while (true) {
            if (scanner.hasNextInt()) {
                int choose = scanner.nextInt();
                if (choose == 1) {
                    System.out.println("Area rectangle = " + rectangle.areaCalculator(1, 2));
                } else if (choose == 2) {
                    System.out.println("Perimeter rectangle = " + rectangle.perimeterCalculator(1, 2));
                } else {
                    System.out.println("Negative number, please repeat: ");
                }
            }
        }
    }
}
