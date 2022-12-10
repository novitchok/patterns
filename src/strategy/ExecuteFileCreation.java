package strategy;

public class ExecuteFileCreation {
    FileCreation fileCreation;

    public void setFileCreation(FileCreation fileCreation) {
        this.fileCreation = fileCreation;
    }

    public void run() {
        fileCreation.createFile();
    }
}
