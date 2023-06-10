package DrunkenLiters;

public class Client {
    public static void main(String[] args) {
        int drunkenLiters0 = DrunkenLiters.liters(2); // 1
        System.out.println(drunkenLiters0);

        int drunkenLiters1 = DrunkenLiters.liters(0.97); // 0
        System.out.println(drunkenLiters1);

        int drunkenLiters2 = DrunkenLiters.liters(14.64); // 7
        System.out.println(drunkenLiters2);

        int drunkenLiters3 = DrunkenLiters.liters(1600.20); // 800
        System.out.println(drunkenLiters3);

        int drunkenLiters4 = DrunkenLiters.liters(80); // 40
        System.out.println(drunkenLiters4);
    }
}
