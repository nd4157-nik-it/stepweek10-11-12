
public class Sol10 {

    public static int[] busiestRow(int[][] grid) {
        int maxTotal = -1;
        int maxRow = 0;

        for (int i = 0; i < grid.length; i++) {
            int sum = 0;

            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }

            if (sum > maxTotal) {
                maxTotal = sum;
                maxRow = i;
            }
        }

        return new int[]{maxRow, maxTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 0, 1},
                {3, 3, 1},
                {1, 1, 1}
        };

        int[] result = busiestRow(grid);

        System.out.println("Row " + result[0] + ", Total " + result[1]);
    }
}
