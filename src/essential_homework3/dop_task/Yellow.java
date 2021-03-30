package essential_homework3.dop_task;

public class Yellow extends Printer {
    public static final String ANSI_YELLOW = "\u001B[33m";

    @Override
    protected void print(String value) {
        System.out.println(ANSI_YELLOW + value + ANSI_RESET);
    }
}
