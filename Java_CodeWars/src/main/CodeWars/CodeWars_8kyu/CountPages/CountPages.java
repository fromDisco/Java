package CodeWars_8kyu.CountPages;

/**
 *
 * return n <= 0 || m <= 0  ? 0 : n * m;
 * @see <a href="https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd/train/java">CodeWars Kate</a>
 */
public class CountPages {
    public static int paperWork(int n, int m) {
        return n <= 0 || m <= 0  ? 0 : n * m;
    }
}
