package CodeWars_5Kyu.printDiamond;

public class App {
    public static void main(String[] args) {
        StringBuffer expected01 = new StringBuffer();
        expected01.append(" *\n");
        expected01.append("***\n");
        expected01.append(" *\n");
        System.out.println(PrintDiamond.print(3));
        System.out.println(expected01.toString());
        System.out.println("3: " + (expected01.toString().equals(PrintDiamond.print(3))));

        StringBuffer expected02 = new StringBuffer();
        expected02.append("  *\n");
        expected02.append(" ***\n");
        expected02.append("*****\n");
        expected02.append(" ***\n");
        expected02.append("  *\n");
        System.out.println("5: " + (expected02.toString().equals(PrintDiamond.print(5))));

        StringBuffer expected03 = new StringBuffer();
        expected03.append("*\n");
        System.out.println("1: " + (expected03.toString().equals(PrintDiamond.print(1))));

        System.out.println("0: " + (null == PrintDiamond.print(0)));

        System.out.println("negative: " + (null == PrintDiamond.print(-2)));

        System.out.println("even number: " + (null == PrintDiamond.print(2)));
    }
}
