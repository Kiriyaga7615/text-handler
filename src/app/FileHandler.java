package app;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    public String createFile(String filePath) {
        Path newFile;
        try {
            newFile = Files.createFile(Path.of(filePath));
        } catch (FileAlreadyExistsException e) {
            return "File already exists!";
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
        return "Created " + newFile;
    }

    public String writeToFile(Path writePath, String content) {
        try {
            Files.writeString(writePath, content);
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Recorded in " + writePath;
    }

    public String readFromFile(String readPath) {
        try {
            return Files.readString(Path.of(readPath));
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }
}

