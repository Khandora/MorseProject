package fileService;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriter {

    public void writeText(String text, String link) {
        try (FileWriter fileWriter = new FileWriter(link, false)){
            fileWriter.write(text);
            System.out.println(text);
            System.out.println("----------------------------------");
            fileWriter.flush();
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }
}