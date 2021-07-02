package Ti;

public class DifferentWay_II {


    public static void main(String[] args) {

//        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] obstacleGrid = {{1}};
        int i = new DifferentWay_II().uniquePathsWithObstacles(obstacleGrid);
        System.out.println(i);

    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        boolean rFlag = false;
        boolean cFlag = false;
        int r = dp.length-1;
        int c = dp[0].length-1;
        //init
        for (int i = r; i >= 0 ; i--) {
            if(obstacleGrid[i][c] == 1){
                rFlag = true;
                dp[i][c] = 0;
            }
            if(rFlag){
                dp[i][c] = 0;
            }else{
                dp[i][c] = 1;
            }

        }
        for (int i = c; i >= 0 ; i--) {
            if(obstacleGrid[r][i] == 1){
                cFlag = true;
                dp[r][i] = 0;
            }
            if(cFlag){
                dp[r][i] = 0;
            }else{
                dp[r][i] = 1;
            }
        }
        for (int i = dp.length-2; i >= 0; i--) {
            for (int j = dp[0].length-2; j >= 0; j--) {

                if(obstacleGrid[i][j] != 1){
                    dp[i][j] = dp[i][j+1]+dp[i+1][j];
                }else{
                    dp[i][j] = 0;
                }

            }
        }
        return dp[0][0];

    }

}
