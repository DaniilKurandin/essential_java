package essential_homework1.task3;

public class Content extends Book {
    String content;

    public Content(String content) {
        this.content = content;
    }


    @Override
    void show() {
        System.out.println("Содержание: " + content);
    }
}
