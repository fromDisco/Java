package Codewars_7kyu.next_perfect_square;

public class App {
    public static void main(String[] args) {
        long square01 = NumberFun.findNextSquare(121); // 144
        System.out.println(square01);
        long square02 = NumberFun.findNextSquare(625); // 676
        System.out.println(square02);
        long square03 = NumberFun.findNextSquare(114); // -1
        System.out.println(square03);
    }
}