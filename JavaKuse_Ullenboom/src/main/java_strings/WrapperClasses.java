import java.util.Formatter;
import java.util.Locale;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class WrapperClasses {
    public static void main(String[] args) {
        String intString = "" + 12;
        String intString2 = String.valueOf(12);
        String doubleString = Double.toString(12.001);
        String charString = Character.toString( 'a');

        String intBinaryString = Integer.toBinaryString(16);
        String intHexString = Integer.toHexString(16);

        // String.format()
        String formatted = String.format("%d, %g, %s%n", 12, 4.137, 23);
        System.out.println(formatted);

        System.out.printf("%5d|%5d%n", 12, -12);
        System.out.printf("%05d|%05d%n", 12, -12);
        System.out.printf("%+5d|%+5d%n", 12, -12);
        System.out.printf("%+-5d|%+-5d%n", 12, -12);

        // floats
        System.out.printf("%f%n", Math.random() * 1000);
        // decimals
        System.out.printf("%.3f|%.0f%n", 9.99999, 9.9999);
        // region specific formatting of strings
        System.out.printf(Locale.CHINA, "%.3f|%.0f%n", 9.99999, 9.9999);

        // left or right oriented text
        String summer = "Summer";
        System.out.printf("|%s|%n", summer);
        // capital letters
        System.out.printf("|%S|%n", summer);
        // right oriented
        System.out.printf("|%10s|%n", summer);
        // left oriented
        System.out.printf("|%-10s|%n", summer);
        // only x-amount of chars
        System.out.printf("|%-10.4s|%n", summer);
        // positional arguments
        String winter = "Winter";
        System.out.printf("%3$s %2$s %3$s %1$s | %n", summer, winter, "|");

        // Formatter()
        Formatter formatter = new Formatter();
        System.out.printf("%nFormatter collects strings: ");
        formatter.format("%n%3$s %2$s %3$s %1$s | ", summer, winter, "|");
        formatter.format("%5.3f|%5.0f%n", 9.99999, 9.9999);
        System.out.println(formatter);

        // StringJoiner
        StringJoiner stringJoiner = new StringJoiner(".", "[", "]");
        stringJoiner.add("192");
        stringJoiner.add("168");
        stringJoiner.add("178");
        stringJoiner.add("25");
        System.out.println(stringJoiner);

        // StringTokenizer
        System.out.printf("%n# StringTokenizer(\"string\"):%n");
        StringTokenizer stringTokenizer = new StringTokenizer("It's summertime \t in europe.");
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextToken());
        }

        // delimeters
        System.out.printf("%n# StringTokenizer(\"string\", \"delimeter\"):%n");
        StringTokenizer stringTokenizer2 = new StringTokenizer("key=value", "=");
        while (stringTokenizer2.hasMoreElements()) {
            System.out.println(stringTokenizer2.nextToken());
        }

        // multiple delimeters
        System.out.printf("%n# StringTokenizer(\"string\", \"multiple delimeters\"):%n");
        StringTokenizer stringTokenizer3 = new StringTokenizer("key=v alue", "= ");
        System.out.printf(".countTokens(): --> %d%n", stringTokenizer3.countTokens());
        while (stringTokenizer3.hasMoreElements()) {
            System.out.println(stringTokenizer3.nextToken());

        }

        // multiple delimeters
        System.out.printf("%n# Parsing data:%n");
        StringTokenizer numberTokenizer = new StringTokenizer("0 8 15");
        int sum = 0;
        while (numberTokenizer.hasMoreTokens()) {
            String number = numberTokenizer.nextToken();
            // .parse... is available on an datatype
            sum += Integer.parseInt(number);
        }
        System.out.printf("The sum is: %d%n", sum);


        // Scanner --> tokenizer
        System.out.printf("%n# Scanner parsing data:%n");
        java.util.Scanner scanner = new java.util.Scanner("1 Spring 2 Summer 3 Autumn 4 Winter");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
            System.out.println(scanner.next());
        }
    }
}
