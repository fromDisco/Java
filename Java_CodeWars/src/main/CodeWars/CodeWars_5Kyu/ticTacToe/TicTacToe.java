package CodeWars_5Kyu.ticTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 + If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved,
 wouldn't we? Our goal is to create a function that will check that for us!
 + Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty,
 1 if it is an "X", or 2 if it is an "O", like so:
 + [[0, 0, 1],
 + [0, 1, 2],
 + [2, 1, 0]]

 + We want our function to return:
 + -1 if the board is not yet finished AND no one has won yet (there are empty spots),
 + 1 if "X" won,
 + 2 if "O" won,
 + 0 if it's a cat's game (i.e. a draw).

 + You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.
 * @see <a href="https://www.codewars.com/kata/525caa5c1bf619d28c000335/train/java">CodwWars Kata</a>
 */
public class TicTacToe {
    public static int isSolved(int[][] board) {
        // if 3 same in one arry are the same
        // if every 1, 2 or 3 in one array are the same
        // if following line has same value on +1 or -1, check previous or next line, too
        for (int outer = 0; outer < board.length; outer++) {
            int counter = 1;

            Arrays.stream(board[outer]).iterator();
            for (int inner = 0; inner < board[outer].length - 1; inner++) {
                counter = board[outer][inner] == board[outer][inner + 1] ? counter + 1 : 1;
                if (counter == 4) {
                    return board[outer][inner];
                }
            }
            System.out.println("___________");
            /*
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][1];
            } else if (board[i][1] == board[i+1][1] && board[i+1][1] == board[i+2][1]) {
                return board[i][1];
            }
            */

        }

        // System.out.println(Arrays.deepToString(board));
        return 0;
    }
}
