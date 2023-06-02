public class SwitchCase {
    public static void main(String[] args) {
        int random_int = (int)(Math.random() * 11);
        System.out.println(random_int);
        String output = "";
        switch (random_int) {
            case 0:
                output = "very good";
                break;
            case 1:
                output = "still very good";
                break;
            case 2:
                output = "good";
                break;
            case 3:
                output = "ok";
                break;
            case 4:
                output = "could be better";
                break;
            case 5:
                output = "not good";
                break;
            case 6:
                output = "bad";
                break;
            default:
                output = "very bad";
        }
        System.out.println(output);

    }
}
