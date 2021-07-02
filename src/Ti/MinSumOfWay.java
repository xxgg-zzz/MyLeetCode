package Ti;

public class MinSumOfWay {
    /**
     * 给定一个包含非负整数的 m x n 网格，
     * 请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小
     */

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int i = new MinSumOfWay().minPathSum(grid);
        System.out.println(i);
    }

    public int minPathSum(int[][] grid) {
        int r = grid.length-1;
        int c = grid[0].length-1;
        int[][] dp = new int[r+1][c+1];
        //init
        dp[r][c] = grid[r][c];
        for (int i = r-1; i >= 0 ; i--) {
            dp[i][c] = grid[i][c] + dp[i+1][c];
        }
        for (int i = c-1; i >= 0 ; i--) {
            dp[r][i] = grid[r][i] + dp[r][i+1];
        }
        //赋值
        for (int i = r-1; i >= 0; i--) {
            for (int j = c-1; j >= 0; j--) {
                dp[i][j] = dp[i+1][j] < dp[i][j+1] ? dp[i+1][j]+grid[i][j] : dp[i][j+1]+grid[i][j];
            }
        }
        return dp[0][0];
    }

}
