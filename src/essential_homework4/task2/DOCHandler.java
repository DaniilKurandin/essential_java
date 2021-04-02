package essential_homework4.task2;

public class DOCHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("Открыть файл doc");
    }

    @Override
    void create() {
        System.out.println("Создать файл doc");
    }

    @Override
    void change() {
        System.out.println("Редактирование файла doc");
    }

    @Override
    void save() {
        System.out.println("Сохранение doc");
    }
}
