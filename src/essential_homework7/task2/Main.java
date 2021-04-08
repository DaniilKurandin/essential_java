package essential_homework7.task2;

public class Main {

    public static void main(String[] args) {

        ErrorPrinter instance = new ErrorPrinter() {
            public final String ANSI_RESET = "\u001B[0m";

            @Override
            public void printError(String error) {
                String RED = "\u001B[31m";
                System.out.println(RED + error + " #FF0000" + ANSI_RESET);
            }
        };

        instance.printError("Любая строка будет красной");
    }
}
