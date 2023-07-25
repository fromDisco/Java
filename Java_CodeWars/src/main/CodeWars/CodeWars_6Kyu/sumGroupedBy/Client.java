package CodeWars_6Kyu.sumGroupedBy;

public class Client {
    public static void main(String[] args) {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};

        String result = SumGroupedBy.stockSummary(art, cd);
        System.out.println("(A : 200) - (B : 1140)".equals(result));
    }
}
