package essential_homework6.dop_task;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("addition = " + calculator.add(654, 213));
        System.out.println("division = " + calculator.div(432, 1));
        System.out.println("multiplication = " + calculator.mul(5, 5));
        System.out.println("subtraction = " + calculator.sub(543, 2));
        System.out.println("remains division = " + calculator.remains(123, 234));
    }

}
