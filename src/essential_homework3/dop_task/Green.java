package essential_homework3.dop_task;

public class Green extends Printer {
    public static final String ANSI_GREEN = "\u001B[32m";

    @Override
    protected void print(String value) {
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}
