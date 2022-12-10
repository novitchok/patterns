package strategy;

import strategy.filetypes.CSVFile;
import strategy.filetypes.SQLFile;
import strategy.filetypes.TextFile;

public class Program {
    public static void main(String[] args) {
        ExecuteFileCreation executeFileCreation = new ExecuteFileCreation();

        executeFileCreation.setFileCreation(new TextFile("text"));
        executeFileCreation.run();

        executeFileCreation.setFileCreation(new CSVFile("customer"));
        executeFileCreation.run();

        executeFileCreation.setFileCreation(new SQLFile("person"));
        executeFileCreation.run();
    }
}
