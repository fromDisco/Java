package fileParser.csv;

import org.parser.CSVParser;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<List> parsedFiles = CSVParser.parser();
        for (List file : parsedFiles) {
            System.out.println(file);
        }
    }
}
