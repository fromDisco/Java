package org.parser;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Reads files of specific Folder and parses the CSV-files
 * by default files in src/main/rescources/upload are read
 */
public class CSVParser
{
    static String separator = File.separator;

    /**
     * Takes a list of files, that are checked if they are CSV-Files.
     * then creates a Map of every Line in the file.
     * @return List of Lists, that contain the HashMaps
     */
    public static @NotNull List<List> parser() {
        String DELIMETER = ",";
        List<List> fileCollector = new ArrayList<>();

        Path dirPath = getDirPath();
        // read all Files in given Directory
        Set<String> fileList = getDirContent(dirPath);

        for (String file : fileList)
        {
            // ignore other formats than CSV
            if (!file.endsWith(".csv")) continue;

            List<Map> linesCollection = new ArrayList<>();

            // try to create new BufferedReader with "file"
            try (BufferedReader reader = Files.newBufferedReader(Paths.get(dirPath + separator + file))) {
                // Get keys, that are always in the first line of the file
                List<String> keys = Arrays.asList(reader.readLine().split(DELIMETER));
                Map<String, String> lineKeyVals;
                String line;
                int lineCounter = 2;

                // read file and create Hashmap out of every line
                // one Map per line, with Table Attribute as Key, and Content as Value
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
                    linesCollection.add(lineKeyVals);
                    lineCounter++;
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            fileCollector.add(linesCollection);
        }
        return fileCollector;
    }

    private static Path getDirPath()
    {
        // Create Platform independent Path
        return Paths.get(
                "src" + separator +
                        "main" + separator +
                        "resources" + separator +
                        "uploads");
    }

    private static Set<String> getDirContent(Path dirPath)
    {
        // read files contained in given directory
        Set<String> fileList = null;
        try (Stream<Path> dirContent = Files.list(dirPath)) {
            fileList = dirContent
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());

            if (fileList.isEmpty()) {
                throw new FileNotFoundException(String.format("No files found in: %s", dirPath));
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return fileList;
    }
}
