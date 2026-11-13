public class Sol2 {
    public static int[] warehouseSummary(int[][] grid) {
        int total = 0;
        int max = -1;
        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                total += grid[i][j];

                if (grid[i][j] > max) {
                    max = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new int[]{total, maxRow, maxCol};
    }
}