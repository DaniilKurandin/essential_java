package essential_homework4.task2;

public class TXTHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("Открыть файл txt");
    }

    @Override
    void create() {
        System.out.println("Создать файл txt");
    }

    @Override
    void change() {
        System.out.println("Редактирование файла txt");
    }

    @Override
    void save() {
        System.out.println("Сохранение txt");
    }
}
