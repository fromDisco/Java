package CodeWars_5Kyu.ticTacToe;

public class App {
    public static void main(String[] args) {
        /*
        int result01 = TicTacToe.isSolved(new int[][] {
            {0, 0, 1},
            {0, 1, 2},
            {2, 1, 0}
        });
        System.out.println(-1 == result01);
        */

        int result02 = TicTacToe.isSolved(new int[][] {
            {1, 1, 1},
            {0, 2, 2},
            {0, 0, 0}
        });
        System.out.println(1 == result02);

        /*
        int result03 = TicTacToe.isSolved(new int[][] {
            {1, 1, 2},
            {0, 2, 0},
            {2, 1, 1}
        });
        System.out.println(2 == result03);

        TicTacToe.isSolved(new int[][] {
            {1, 2, 1},
            {1, 1, 2},
            {2, 1, 2}
        });
        System.out.println(0 == result03);
         */
    }
}
