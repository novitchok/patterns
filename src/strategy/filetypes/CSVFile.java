package strategy.filetypes;

import strategy.FileCreation;

import java.io.File;
import java.io.IOException;

public class CSVFile implements FileCreation {

    private final String FILE_TYPE = ".csv";
    private final String fileName;

    public CSVFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void createFile() {
        try {
            File file = new File("src/strategy/files/" + fileName + FILE_TYPE);
            if (file.createNewFile()) {
                System.out.println("File was created: " + file.getName());
            } else {
                System.out.println("File " + file.getName() + " is already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}