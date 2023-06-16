package CodeWars_8kyu.EvenOrOdd;

public class Client {
    public static void main(String[] args) {
        EvenOrOdd eoo = new EvenOrOdd();
        String result0 = eoo.even_or_odd(6); // "Even",
        System.out.println(result0);

        String result1 = eoo.even_or_odd(7); // "Odd",
        System.out.println(result1);

        String result2 = eoo.even_or_odd(0); //  "Even"
        System.out.println(result2);

        String result3 = eoo.even_or_odd(-1); //  "Odd",
        System.out.println(result3);
    }
}
