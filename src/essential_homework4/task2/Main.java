package essential_homework4.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        DefinitionFormat file = new DefinitionFormat();
        file.getFileExtension(new File("readme.xml"));
    }
}
