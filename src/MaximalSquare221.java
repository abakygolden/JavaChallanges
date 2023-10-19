import java.util.Arrays;

public class MaximalSquare221 {
    public MaximalSquare221() {
    }

    ;

    public static char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};

    public static int maximalSquare(char[][] matrix) {
        int[][] cache = new int[matrix.length][matrix[0].length];
        helper(cache,matrix,0,0);
        int result = Arrays.stream(cache)
                .flatMapToInt(Arrays::stream)  // Flatten the 2D array into a stream of integers
                .max()
                .getAsInt();

        return result*result;
    }

    public static int helper(int[][] cache, char[][] matrix, int j, int i) {
        if (j >= matrix.length || i >= matrix[0].length) {
            return -1;
        }
        if (cache[j][i] == 0) {
            int down = helper(cache, matrix, j + 1, i);
            int right = helper(cache, matrix, j, i + 1);
            int diag = helper(cache, matrix, j + 1, i + 1);

            cache[j][i] = 0;
            if (matrix[j][i] == '1') {
                int min = Math.min(down, right);
                min = Math.min(min, diag);
                min = min == -1 ? 0 : min;
                cache[j][i] = 1 + min;
            }
        }
        return cache[j][i];

    }
}
