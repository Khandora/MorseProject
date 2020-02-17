package fileService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
    private String line;

    public String readText(String filepath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            this.line = reader.readLine();
            System.out.println(line);
            return this.line;
        } catch (IOException e) {
            e.printStackTrace();
            return this.line;
        }
    }
}