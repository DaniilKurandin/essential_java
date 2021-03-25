package essential_homework1.task3;

import java.util.Scanner;

public class Title extends Book {
    String title;

    public Title(String title) {
        this.title = title;
    }

    @Override
    void show() {
        System.out.println("Название: " + title);
    }
}
