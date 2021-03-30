package essential_homework3.dop_task;

public class Black extends Printer {
    public static final String ANSI_BLACK = "\u001B[30m";

    @Override
    protected void print(String value) {
        System.out.println(ANSI_BLACK + value + ANSI_RESET);
    }
}
