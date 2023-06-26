package exceptionInheritance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class ExceptionInheritance {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Path.of("file.txt"));
            for (String line : lines) {
                System.out.println(Integer.toBinaryString(Integer.parseInt(line)));
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println("e.getClass(): " + e.getClass());
            System.err.println("e.toString(): " + e.toString());
        }
    }
}
