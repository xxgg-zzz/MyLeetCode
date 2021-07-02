public class Solution {

    public static void main(String[] args) {

        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        int r = new Solution().maxValue(grid);
        System.out.println(r);
    }

    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j ==0){
                    dp[i][j] = grid[i][j];
                    continue;
                }
                if(i==0){
                    dp[i][j] = grid[i][j]+dp[i][j-1];
                    continue;
                }
                if(j==0){
                    dp[i][j] = grid[i][j]+dp[i-1][j];
                    continue;
                }

                dp[i][j] = dp[i-1][j]>dp[i][j-1]? dp[i-1][j]+grid[i][j] : dp[i][j-1]+grid[i][j];

            }
        }
        return dp[dp.length-1][dp[0].length-1];

    }
}
