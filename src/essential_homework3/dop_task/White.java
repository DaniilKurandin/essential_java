package essential_homework3.dop_task;

public class White extends Printer {
    public static final String ANSI_WHITE = "\u001B[37m";

    @Override
    protected void print(String value) {
        System.out.println(ANSI_WHITE + value + ANSI_RESET);
    }
}
