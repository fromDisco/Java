public class ArrayInitializing {
    public static void main(String[] args) {
        String[] names = new String[1];
        names[0] = "Sunny";
        System.out.println(names[0]);

        String[] names_2 = {"Summer"}; // -> String[] names = new String[1] -> names[0] = "Summer";
        names_2 = new String[]{"Ice"};
        System.out.println(names_2[0]);
    }
}
