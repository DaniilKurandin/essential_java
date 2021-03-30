package essential_homework3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentWorker document = new DocumentWorker();

        System.out.println("Введите ключ доступа: ");
        String key = scanner.nextLine();

        switch (key){
            case "exp": {
                System.out.println("Вам доступна версия expert");
                document = new ExpertDocumentWorker();
                document.openDocument();
                document.editDocument();
                document.saveDocument();
                break;
            }
            case "pro": {
                System.out.println("Вам доступна версия pro");
                document = new ProDocumentWorker();
                document.openDocument();
                document.editDocument();
                document.saveDocument();
                break;
            }
            default: {
                System.out.println("Вам доступна бесплатная версия");
                document.openDocument();
                document.editDocument();
                document.saveDocument();
                break;
            }
        }
    }
}
