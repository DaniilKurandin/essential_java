package essential_homework1.task3;

import java.util.Scanner;

public class Author extends Book {
    String author;

    public Author(String author) {
        this.author = author;
    }


    @Override
    void show() {
        System.out.println("Автор: " + author);
    }
}
