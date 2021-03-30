package essential_homework3.dop_task;

public class Red extends Printer {
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    protected void print(String value) {
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }
}
