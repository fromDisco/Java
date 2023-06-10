public class StringBuilderClass {
    public static void main(String[] args) {
        // Length, Capacity
        System.out.println("# StringBuilder length and capacaty:");
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("stringBuilder.length() -> " + stringBuilder.length());
        System.out.println("stringBuilder.capcacity() -> " + stringBuilder.capacity());

        System.out.printf("%n# stringBuilder.append(\"Lorem ipsom ...\")%n");
        stringBuilder.append("In 2 hours is my first project meeting");

        // StringBuild has dynamic length and capacity -> length <= capacity!
        System.out.println("stringBuilder.length() -> " + stringBuilder.length());
        System.out.println("stringBuilder.capcacity() -> " + stringBuilder.capacity());

        // if max-capacity is exeeded, StringBuilder doubles the capacity
        // this saves operations: creating new string, saving old string to new string, garbage collect
        stringBuilder.append(".");
        System.out.printf("%n# stringBuilder.append(\".\")%n");
        System.out.println("stringBuilder.length() -> " + stringBuilder.length());
        System.out.println("stringBuilder.capcacity() -> " + stringBuilder.capacity());

        // .delete()
        stringBuilder.delete(stringBuilder.length() / 2, stringBuilder.length());
        System.out.printf("%n# stringBuilder.delete(start, end)%n");
        System.out.println(stringBuilder.toString());
        System.out.println("stringBuilder.length() -> " + stringBuilder.length());
        System.out.println("stringBuilder.capcacity() -> " + stringBuilder.capacity());

        // .trimsize()
        stringBuilder.trimToSize();
        System.out.printf("%n# stringBuilder.trimToSize()%n");
        System.out.println("stringBuilder.length() -> " + stringBuilder.length());
        System.out.println("stringBuilder.capcacity() -> " + stringBuilder.capacity());

        // StringBuilder
        StringBuilder sentence = new StringBuilder();
        String input;
        do {
            input = new java.util.Scanner( System.in ).nextLine();
            sentence.append(input);
        } while (! input.isEmpty());
        System.out.println(sentence.toString());
    }
}
