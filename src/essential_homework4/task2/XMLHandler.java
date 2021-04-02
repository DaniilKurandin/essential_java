package essential_homework4.task2;

public class XMLHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("Открыть файл XML");
    }

    @Override
    void create() {
        System.out.println("Создать файл XML");
    }

    @Override
    void change() {
        System.out.println("Редактирование файла XML");
    }

    @Override
    void save() {
        System.out.println("Сохранение XML");
    }
}
