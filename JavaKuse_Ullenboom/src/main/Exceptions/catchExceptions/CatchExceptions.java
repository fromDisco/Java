package catchExceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.security.CodeSource;
import java.security.ProtectionDomain;

public class CatchExceptions {
    public static void main(String[] args) {
        // get path of current file
        CatchExceptions example = new CatchExceptions();

        // get user directory and compose path manually
        String userDir = System.getProperty("user.dir");
        userDir += "/src/main/Exceptions/CatchExceptions/";
        String fileName = "filename.txt";
        String absolutePath = userDir + File.separator + fileName;
        Path filePath = Paths.get(absolutePath);

        // prepare list, that is written to file
        List<String> list = new ArrayList<>();
        list.add("Hallöchen.");

        try {
            // write list int filePath
            Files.write(filePath, list);
            System.out.println();
        } catch (IOException ioe) {
            System.out.println(ioe);
            System.out.println("somethings wrong");
        }

    }

    /**
     * Get path of this file
     */
    public void getFilePath() {
        Class<?> thisClass = getClass();
        ProtectionDomain domain = thisClass.getProtectionDomain();
        CodeSource source = domain.getCodeSource();
        System.out.println(source.getLocation().getPath());
    }
}
