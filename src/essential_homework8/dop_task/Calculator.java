package essential_homework8.dop_task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    void div(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("/ by zero");
        }
    }

    void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose operation \"+\" \"-\" \"*\" \"/\"");

        String choose = sc.nextLine();

        try {
            switch (choose) {
                case "+": {
                    System.out.println("Enter two numbers");
                    System.out.println(add(sc.nextInt(), sc.nextInt()));
                    break;
                }
                case "-": {
                    System.out.println("Enter two numbers");
                    System.out.println(sub(sc.nextInt(), sc.nextInt()));
                    break;
                }
                case "*": {
                    System.out.println("Enter two numbers");
                    System.out.println(mul(sc.nextInt(), sc.nextInt()));
                    break;
                }
                case "/": {
                    System.out.println("Enter two numbers");
                    div(sc.nextInt(), sc.nextInt());
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Exception");
        }
    }
}


