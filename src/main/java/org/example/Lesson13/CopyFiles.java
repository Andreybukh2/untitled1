package org.example.Lesson13;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFiles {
    public static void copyFile(File src, File dest) throws IOException {
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    public static void main(String[] args) {
        File from = new File("input" + ".txt");
        {
            File to = new File("output" + "_копия" + ".txt");
            try {
                copyFile(from, to);
                System.out.println("Файл скопирован");
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
