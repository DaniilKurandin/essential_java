package essential_homework4.task2;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DefinitionFormat file = new DefinitionFormat();
        file.getFileExtension(new File("readme.xml"));
    }
}
