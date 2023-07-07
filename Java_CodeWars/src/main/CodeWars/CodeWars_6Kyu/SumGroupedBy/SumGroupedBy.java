package CodeWars_6Kyu.SumGroupedBy;
import static java.util.stream.Collectors.joining;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z.
 * Each book has a code c of 3, 4, 5 or more characters.
 * The 1st character of a code is a capital letter which defines the book category.
 * <p>
 * In the bookseller's stocklist each code c is followed by a space and by a positive integer n
 * (int n >= 0) which indicates the quantity of books of this code in stock.
 * <p>
 * For example an extract of a stocklist could be:
 * L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}.
 * or
 * L = ["ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"] or ....
 * <p>
 * You will be given a stocklist (e.g. : L) and a list of categories in capital letters e.g :
 * M = {"A", "B", "C", "W"}
 * or
 * M = ["A", "B", "C", "W"] or ...
 * <p>
 * and your task is to find all the books of L with codes belonging to each category of M and
 * to sum their quantity according to each category.
 * For the lists L and M of example you have to return the string (in Haskell/Clojure/Racket/Prolog a list of pairs):
 * (A : 20) - (B : 114) - (C : 50) - (W : 0)
 * where A, B, C, W are the categories, 20 is the sum of the unique book of category A,
 * 114 the sum corresponding to "BKWRK" and "BTSQZ", 50 corresponding to "CDXEF"
 * and 0 to category 'W' since there are no code beginning with W.
 * <p>
 * If L or M are empty return string is "" (Clojure/Racket/Prolog should return an empty array/list instead).
 * Notes:
 * In the result codes and their values are in the same order as in M.
 * See "Samples Tests" for the return.
 * @see <a href="https://www.codewars.com/kata/54dc6f5a224c26032800005c/train/java">Codewars Kata Help the bookseller!</a>
 */
public class SumGroupedBy {
    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] categories) {
        if (lstOfArt.length == 0 || categories.length == 0) {
            return "[]";
        }
        // get first letters == category
        HashMap<String, Integer> rawHashMap = getHashMap(categories);
        // map amount to category
        HashMap<String, Integer> articleList = mapCount(rawHashMap, lstOfArt);
        // create output string
        return formatOutput(articleList);
    }

    /**
     * Convert list of required categoreis into HashMap
     *
     * @param categories String[] of reqiered catgories ["A", "B"]
     * @return HashMap of categories with initial value (Integer) 0
     */
    private static HashMap<String, Integer> getHashMap(String[] categories) {
        HashMap<String, Integer> categoryList = new HashMap<>();
        for (int i = 0; i < categories.length; i++) {
            categoryList.put(categories[i], 0);
        }
        return categoryList;
    }

    /**
     * Count number of items in category
     *
     * @param categoryMap initial map of categories
     * @param lstOfArt passed article list
     * @return
     */
    private static HashMap<String, Integer> mapCount(HashMap<String, Integer> categoryMap, String[] lstOfArt) {
        for (String article : lstOfArt) {
            // get (int) amount of product
            String firstLetter = Character.toString(article.charAt(0));
            int amount = Integer.parseInt(article.split(" ")[1]);

            // update value of hashMap with amount
            if (categoryMap.containsKey(firstLetter)) {
                categoryMap.replace(firstLetter, categoryMap.get(firstLetter) + amount);
            }
        }
        return categoryMap;
    }

    private static String formatOutput(HashMap<String, Integer> map) {
        String output = map.entrySet()
                .stream()
                .map(e -> "(" + e.getKey()+" : "+e.getValue() + ")")
                .collect(joining(" - "));
        return output;
    }
}
