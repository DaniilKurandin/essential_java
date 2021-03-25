package essential_homework1.task3;

public class Main {
    public static void main(String[] args) {
        Book author = new Author("А.С.Пушкин\n");
        Book content = new Content("1833 год стал годом выхода в свет небольшого романа Пушкина «Дубровский»,\nсозданного автором на основе реального рассказа В. П. Нащокина.\nПроизведение многие считают незаконченным романом, который отразил характерные черты помещичьей России.\n");
        Book title = new Title("Дубровский\n");

        author.show();
        title.show();
        content.show();

    }
}
