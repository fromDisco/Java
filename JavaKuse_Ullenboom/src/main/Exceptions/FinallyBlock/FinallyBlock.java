package FinallyBlock;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

/**
 * finally excecutes even after return or exception
 */
public class FinallyBlock {
    public static void main(String[] args) {
        FinallyBlock meMyselfAndI = new FinallyBlock();

        try {
            meMyselfAndI.streams();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        System.out.println(meMyselfAndI.executeAfterReturn());
        System.out.println(meMyselfAndI.excecuteAfterException());
    }

    // excecute after return
    public long executeAfterReturn() {
        long start = System.nanoTime();
        try {
            boolean num = new BigInteger("29385768138329174375832985213984891255").isProbablePrime(100);
            // return is not preventing finally from excecuting
            return start;
        } finally {
            long end = System.nanoTime();
            System.out.println("Duration after Return: " + TimeUnit.NANOSECONDS.toMillis(end - start));
        }
    }

    // excecute after exception
    public long excecuteAfterException() {
        long start = System.nanoTime();
        try {
            boolean num = new BigInteger("29385768138329174375832985213984891255").isProbablePrime(100);
            // create Error
            return 1 / 0;
        } finally {
            long end = System.nanoTime();
            System.out.println("Duration after Exception: " + TimeUnit.NANOSECONDS.toMillis(end - start));
        }
    }

    public void streams() throws XMLStreamException {
        // get user directory and compose path manually
        String userDir = System.getProperty("user.dir");
        userDir += "/src/main/Exceptions/FinallyBlock/";
        String fileName = "stream.xml";
        String absolutePath = userDir + File.separator + fileName;
        Path filePath = Paths.get(absolutePath);

        // declate outside of try block so that finally can access this variable.
        XMLStreamWriter writer = null;
        try {
            PrintWriter printWriter = new PrintWriter(filePath.toFile(), StandardCharsets.UTF_8);
            writer = XMLOutputFactory.newInstance().createXMLStreamWriter(printWriter);
            writer.writeStartDocument();
            writer.writeStartElement("persons");
            writer.writeCharacters("Rookie");
            writer.writeEndElement();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // check if writer was initialized, if so it has to be closed
            if (writer != null) {
                writer.close();
                System.out.println();
            }
        }
    }
}
