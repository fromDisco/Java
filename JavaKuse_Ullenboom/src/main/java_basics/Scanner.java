public class Scanner {
    public static void main(String[] args) {
        System.out.println("Whats your Word?");
        // Scanner can also read from a file
        String word = new java.util.Scanner( System.in ).nextLine();
        System.out.printf("Your word is: %s%n", word);

        System.out.println("Whats your float?");
        // Scanner can also read from a file
        double digit = new java.util.Scanner( System.in ).nextDouble(); // localized input. For germany camma instead period
        System.out.printf("Your number is: %.2f%n", digit);
    }
}
