package essential_homework1.task3;

public class Author extends Book {
    String author;

    @Override
    void show() {
        System.out.println(author = "Автор: А.С.Пушкин");
    }
}
