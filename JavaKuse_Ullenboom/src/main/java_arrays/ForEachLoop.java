public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Room", "House", null, "Roof"};
        int i = 0;

        for (String name : names) {
            if (name == null) {
                continue;
            }
            System.out.printf("%d: %s%n", i, name);
            i++;
        }
    }
}
