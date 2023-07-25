package CodeWars_8kyu.CountPages;

public class App {
    public static void main(String[] args) {
        int result01 = CountPages.paperWork(5,5); // 25,
        System.out.println(result01);

        int result02 = CountPages.paperWork(5,-5); // 0
        System.out.println(result02);

        int result03 = CountPages.paperWork(-5,-5); // 0
        System.out.println(result03);

        int result04 = CountPages.paperWork(-5,5); // 0
        System.out.println(result03);

        int result05 = CountPages.paperWork(5,0); // 0
        System.out.println(result04);
    }
}
