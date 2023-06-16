package CodeWars_8kyu.NameCentury;

public class Client {
    public static void main(String[] args) {
        int century0 = NameCentury.century(1705); // 18
        System.out.println(century0);

        int century1 = NameCentury.century(1900); // 19
        System.out.println(century1);

        int century2 = NameCentury.century(1601); // 17
        System.out.println(century2);

        int century3 = NameCentury.century(2000); // 20
        System.out.println(century3);

        int century4 = NameCentury.century(89); // 1
        System.out.println(century4);
    }
}
