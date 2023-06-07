public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] nums_array = new int[4][3];
        int[][] example = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        print_multi_d(example);

        // multidimensional array in one dimensional spelling
        // works only if every row has the same lenght
        int[] one_dimension = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int row = 1;
        int row_width = 3;
        int col = 1;
        System.out.printf("One dimensional output: %d%n", one_dimension[row * row_width + col]); // --> 5


        int[][] array = new int[5][];
        int[][] pyramid = create_pyramid(array);

        print_multi_d(pyramid);

    }

    static void print_multi_d(int[][] arrays) {
        for (int[] array : arrays) {
            for (int num : array) {
                System.out.printf("%3d", num);
            }
            System.out.println("");

        }
    }

    static int[][] create_pyramid(int[][] array) {
        int add = 0;
        for (int i = 0; i < array.length; i++) {

            int[] row = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                row[j] = i + add;
                // next line starts with same "add" like previous line ends
                if (j != i) {
                    add++;
                }
            }
            array[i] = row;
        }

        return array;
    }
}
