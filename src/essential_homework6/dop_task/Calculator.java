package essential_homework6.dop_task;

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

    double div(double a, double b) {
        if (b == 0) {
            System.out.print("Division by zero ");
            return 0;
        }

        return a / b;
    }

    double remains(int a, int b) {
        if (b == 0) {
            System.out.print("Division by zero ");
            return 0;
        }
        return a % b;
    }
}
