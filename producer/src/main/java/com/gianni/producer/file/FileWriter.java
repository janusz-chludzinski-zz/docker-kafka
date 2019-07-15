package com.gianni.producer.file;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class FileWriter {

    public String writeToFile(String message) {
        Path filePath = Paths.get("/tmp/sampleFile.txt");

        try {
            Path file = Files.createFile(filePath);
            Files.write(file, message.getBytes());

        } catch (IOException e) {
            System.out.println("Ooops! I was unable to create a file. REASON:");
            e.printStackTrace();
        }

        return filePath.toString();
    }

}
