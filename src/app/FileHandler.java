package app;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    public String createFile() {
        Path newFile;
        try {
            newFile = Files(Path.of(path));
        } catch (FileAlreadyExistsException e) {
            return "File already exists!";
        } catch (IOException e) {
            return "Something wrong " +;
        }
        return "Created " + newFile;
    }

    public String writeToFile(Path  content) {
        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Recorded in " + path;
    }

    public String readFromFile(String path) {
        try {
            return readString(Path(path));
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }
}

