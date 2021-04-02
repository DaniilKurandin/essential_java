package essential_homework4.task2;

import java.io.File;

public class DefinitionFormat {
    protected String getFileExtension(File file) {
        TXTHandler txt = new TXTHandler();
        XMLHandler xml = new XMLHandler();
        DOCHandler doc = new DOCHandler();
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            String format = fileName.substring(fileName.lastIndexOf(".") + 1);
            switch (format) {
                case "txt": {
                    txt.open();
                    txt.change();
                    txt.create();
                    txt.save();
                    break;
                }
                case "xml": {
                    xml.open();
                    xml.change();
                    xml.create();
                    xml.save();
                    break;
                }
                case "doc": {
                    doc.open();
                    doc.change();
                    doc.create();
                    doc.save();
                    break;
                }
                default: {
                    System.out.println("Неверный формат");
                }
            }
            return format;
        } else {
            return "";
        }
    }
}
