package CodeWars_6Kyu.findOddNumberOf;

public class App {
    public static void main(String[] args) {
        int oddInt01 = FindOddInt.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}); // 5
        System.out.println(oddInt01);
        int oddInt02 = FindOddInt.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}); // -1
        System.out.println(oddInt02);
        int oddInt03 = FindOddInt.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}); // 5
        System.out.println(oddInt03);
        int oddInt04 = FindOddInt.findIt(new int[]{10}); // 10
        System.out.println(oddInt04);
        int oddInt05 = FindOddInt.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}); // 10
        System.out.println(oddInt05);
        int oddInt06 = FindOddInt.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}); // 1
        System.out.println(oddInt06);
    }
}
