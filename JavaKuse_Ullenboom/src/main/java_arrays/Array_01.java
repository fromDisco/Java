public class Array_01 {
    public static void main(String[] args) {
        int min = get_min(15);
        int max = get_num(min, 15);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        print_array(get_square(min, max));
    }

    public static int get_min(int max) {
        return get_num(0, max);
    }

    public static int get_num(int min, int max) {
        return min + (int)(Math.random() * (max - min));
    }

    public static int[] get_square(int start, int end) {
        // +1 because both, min and max should be included in the array
        int[] nums = new int[end - start + 1];
        int position = start;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = position * position;
            position++;
        }
        return nums;
    }
    public static void print_array(int[] primes) {
        for (int i = 0; i < primes.length; i++) {
            if (i < primes.length - 1) {
                System.out.printf("%d, ", primes[i]);
            } else {
                System.out.printf("%d%n", primes[i]);
            }
        }
    }
}
