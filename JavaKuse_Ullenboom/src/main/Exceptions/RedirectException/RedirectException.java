package RedirectException;

import java.io.IOException;

public class RedirectException {
    public static void main(String[] args) {
        try {
            UncheckedExceptions uncheckedException = new UncheckedExceptions();
        } catch (NullPointerException | IOException e) {
            System.err.println(e.getStackTrace());
            e.printStackTrace();
        }

    }
}
