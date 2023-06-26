package tryWithRecources;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * autoclose IO-Streams that are passed as argument
 * to try () {}
 * @see Cloneable
 */
public class TryWithRecources {
    public static void main(String[] args) {
        // write initial file
        File file = createFile("stream.txt").toFile();
        writeFile(file);

        // copy initial file content into new file
        File newFile = createFile("streamCopy.txt").toFile();
        copyFile(file, newFile);

        readFile(file);
        readFile(newFile);
    }

    public static Path createFile(String fileName) {
        // get user directory and compose path manually
        String userDir = System.getProperty("user.dir");
        userDir += "/src/main/Exceptions/TryWithRecources/";
        String absolutePath = userDir + File.separator + fileName;
        return Paths.get(absolutePath);
    }

    public static void writeFile(File file) {
        // autoclose writer
        try (PrintWriter writer = new PrintWriter(file, StandardCharsets.UTF_8)) {
            writer.println("This is a beginning.");
            writer.println("This is a end.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(File file, File newFile) {
        // autoclose writer and scanner
        // writer is closed first. Last in first out!
        try (Scanner scanner = new Scanner(Paths.get(file.toURI()));
            PrintWriter writer = new PrintWriter(newFile, StandardCharsets.UTF_8)) {
            while (scanner.hasNextLine()) {
                writer.println("copy: " + scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(File file) {

        // autoclose scanner
        try (Scanner scanner = new Scanner(Paths.get(file.toURI()))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
