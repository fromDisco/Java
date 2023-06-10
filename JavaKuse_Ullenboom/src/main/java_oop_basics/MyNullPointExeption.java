public class MyNullPointExeption {
    public static void main(String[] args) {
        // predefine variables with null, so that they are defined but empty
        // BUT null is no object
        java.awt.Point point = null;
        String word = null;
        System.out.println("Point is Null: " + point);
        System.out.println("String is Null: " + word);

        int random_num = (int)(Math.random() * 11);
        System.out.printf("random_num: %d%n", random_num);
        if (random_num > 5) {
            word = "I think, therefore i am.";
        }

        // if random_num would be <= 5, word would be null -> java.lang.NullPointerException
        if (word != null) {
            System.out.printf("length of word: %d", word.length());
        }
    }
}
