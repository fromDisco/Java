public class OverloadedMethods {
    public static void main(String[] args) {
        System.out.println("Hello%nWorld"); // linebreak not working
        System.out.printf("Hello%nWorld"); // allows format specifier like %n --> linebreak
        System.out.print("Hello");
        System.out.print(" Freak"); // no new line after print
        System.out.println("I don't want to sit right next to you.");
        // further format specifiers
        System.out.printf("%d+%d=%d", 2, 2, 4); // %d stands for digit. Arguments are passed after the string
        System.out.printf("%n%s %s, %d", "Its", "Saturday", 2023); // %s stands for string.
    }
}
