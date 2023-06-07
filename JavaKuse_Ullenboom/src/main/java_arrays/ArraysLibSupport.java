public class ArraysLibSupport {
    static public void main(String[] args) {
        int[] numbers = {1, 15, 8, 7, 11};
        System.out.println("# .clone(). Check if index 2 contains same element");
        int[] clone = numbers.clone();
        System.out.println(clone[2]);

        // .clone()
        // only clones the first dimension
        // all other dimensions are only copied by reference
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] matrix_clone = matrix.clone();
        System.out.println("# compare 1. dimension of multidimesional array:");
        System.out.println(matrix_clone == matrix); // --> false
        System.out.println("# compare 2. dimension of multidimesional array:");
        System.out.println(matrix_clone[0] == matrix[0]); // --> true, 2. dimension is the same

        // .arraycopy()
        System.out.printf("%n# System.arraycopy. Copy first two elements:%n");
        int[] numbers_copy = new int[5];
        System.arraycopy(numbers, 0, numbers_copy, 0, 2);
        for (int number : numbers_copy) {
            System.out.println(number);
        }

        // .mismatch()
        int compare = java.util.Arrays.mismatch(numbers, numbers_copy);
        System.out.printf("%n# java.util.Arrays.mismatch:");
        System.out.printf("%nmismatch at: %d%n", compare);

        // .sort()
        System.out.printf("%n# .sort() numbers array:%n");
        java.util.Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.printf("%d, ", number);
        }
        System.out.println();

        // .toString()
        System.out.printf("%n# .toString() numbers array:%n");
        String numbers_array = java.util.Arrays.toString(numbers);
        System.out.println(numbers_array);

        // .binarySearch()
        // array must be sorted for binary search
        System.out.printf("%n# .binarySearch() numbers array:%n");
        String[] names = {"Ape", "Astronaut", "Banana"};
        int search_index = java.util.Arrays.binarySearch(names, "Banane");
        System.out.println(search_index);

        // .equals()
        String[] words_1 = {"Bike", "Tire", "Train"};
        String[] words_2 = {"Bike", "Tire", "Train"};
        boolean is_equal = java.util.Arrays.equals(words_1, words_2);
        System.out.printf("%n# .equals(String[], String[])");
        System.out.printf("%nAre arrays equal: %b", is_equal);

        System.out.println(Double.compare(2, 1));
    }
}
