package CodeWars_8kyu.SumOfIntAndString;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        SumOfIntAndString sumOfIntAndString = new SumOfIntAndString();
        int sum01 = sumOfIntAndString.sum(Arrays.asList(5,"5")); // 10
        System.out.println(sum01);

        int sum02 = sumOfIntAndString.sum(Arrays.asList(9, 3, "7", "3")); // 22
        System.out.println(sum02);

        int sum03 = sumOfIntAndString.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)); // 42
        System.out.println(sum03);

        int sum04 = sumOfIntAndString.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")); // 41
        System.out.println(sum04);

        int sum05 = sumOfIntAndString.sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")); // 45
        System.out.println(sum05);

        int sum06 = sumOfIntAndString.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")); // 41
        System.out.println(sum06);

        int sum07 = sumOfIntAndString.sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)); // 61
        System.out.println(sum07);
    }
}
