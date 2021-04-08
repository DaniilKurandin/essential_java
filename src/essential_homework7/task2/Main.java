package essential_homework7.task2;

public class Main {

    public static void main(String[] args) {

        ErrorPrinter instance = new ErrorPrinter() {

            @Override
            public void printError(String error) {
                System.out.println("\u001B[31m" + error + "\u001B[0m" + "\ncode color - #FF0000");
            }
        };

        instance.printError("any one string");
    }
}
