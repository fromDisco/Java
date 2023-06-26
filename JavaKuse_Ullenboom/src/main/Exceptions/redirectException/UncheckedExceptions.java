package redirectException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class UncheckedExceptions {
    String name;

    // throws IOException passes Error to client
    /**
     * @throws IOException if path is null
     */
    UncheckedExceptions() throws IOException {
        // unchecked Error
        Path path = Paths.get(name);
        // checked Error
        List<String> strings = Files.readAllLines(path);
    }
}
