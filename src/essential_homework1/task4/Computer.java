package essential_homework1.task4;

import java.util.Arrays;

public class Computer {

    static Computers[] computers = new Computers[5];

    static class Computers {
        String name;

        Computers(String name) {
            this.name = name;
        }
    }
}
