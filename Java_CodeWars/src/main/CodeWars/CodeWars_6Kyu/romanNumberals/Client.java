package CodeWars_6Kyu.romanNumberals;

public class Client {
    public static void main(String[] args) {
        String roman0 = RomanNumerals.solution(1158); // "MCLVIII"
        System.out.println(roman0);
        String roman1 = RomanNumerals.solution(4); // "IV"
        System.out.println(roman1);
        String roman2 = RomanNumerals.solution(6); // "VI"
        System.out.println(roman2);
        String roman3 = RomanNumerals.solution(1154); // "VI"
        System.out.println(roman3);
    }
}
