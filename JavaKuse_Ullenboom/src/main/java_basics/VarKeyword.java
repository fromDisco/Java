import java.util.ArrayList;

public class VarKeyword {
    public static void main(String[] args) {
        // var can be used instead of a datatpye
        // can get handy when defining variables like this.
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        ArrayList<String> innerList1 = new ArrayList<String>();
        innerList1.add("Today is 31st of May.");
        innerList1.add("Tomorrow is 1st of june, and my first day at rocon.");
        list.add(innerList1);
        System.out.println(list);

        ArrayList<String> innerList2 = new ArrayList<String>();
        innerList2.add("Lets see, what tomorrow brings.");
        list.add(innerList2);
        System.out.println(list);
        System.out.println(list.get(0));

        for (ArrayList<String> innerList : list) {
            System.out.println("LOOP");
            System.out.println(innerList);
        }

        // same, same but different
        var list_short = new ArrayList<ArrayList<String>>();
        System.out.println(list_short);
    }
}
