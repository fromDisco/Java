package fileParser.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        String DELIMETER = ",";
        String separator = File.separator;

        // Create Platform independent Path
        Path dirPath= Paths.get(
                "src" + separator +
                "main" + separator +
                "resources" + separator +
                "uploads");

        // read files contained in given directory
        Set<String> fileList = null;
        try (Stream<Path> dirContent = Files.list(dirPath)) {
            fileList = dirContent
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        if (fileList != null) {
            for (String file : fileList)
                // try to create new BufferedReader with "file"
                try (BufferedReader reader = Files.newBufferedReader(Paths.get(dirPath + separator + file))) {
                    // Get keys, that are always in the first line of the file
                    List<String> keys = Arrays.asList(reader.readLine().split(DELIMETER));

                    String line;
                    Map<String, String> lineKeyVals;
                    List<Map> linesCollection = new ArrayList<>();
                    int lineCounter = 2;

                    while ((line = reader.readLine()) != null) {
                        List<String> values = Arrays.asList(line.split(DELIMETER));

                        // if number of keys don't match the values throw error
                        if (keys.size() != values.size()) {
                            throw new IllegalArgumentException(
                                    String.format(
                                            "Error in File: %s. " +
                                            "Number of Keys (%d) and Values (%d) are mismatching at line %d",
                                            file,
                                            keys.size(),
                                            values.size(),
                                            lineCounter
                                    )
                            );
                        }

                        // zip keys and values to HashMap
                        lineKeyVals = IntStream.range(0, keys.size()).boxed().collect(Collectors.toMap(keys::get, values::get));
                        // collect HashMaps of individual lines
                        linesCollection.add(lineKeyVals);
                        lineCounter++;
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

        }
    }
}
