package Ti;

public class NumOfRange {
    /**
     * 给定一个整数数组 nums，返回区间和在 [lower, upper] 之间的个数，包含 lower 和 upper。
     区间和 S(i, j) 表示在 nums 中，位置从 i 到 j 的元素之和，包含 i 和 j (i ≤ j)。
     [-2147483647,0,-2147483647,2147483647]
     -564
     3864
     */

    public static void main(String[] args) {

        int[] nums = {-2147483647,0,-2147483647,2147483647};
        int lower = -564;
        int upper = 3864;
        int result = new NumOfRange().countRangeSum(nums,lower,upper);
        System.out.println(result);
    }

    public int countRangeSum(int[] nums, int lower, int upper) {

        if(nums.length==0){
            return 0;
        }
        int len = nums.length;
        int count = 0;

        long s = 0;
        long[] sumAry = new long[len+1];
        for (int i = 0; i < len; i++) {
            s+=nums[i];
            sumAry[i] = s;
        }
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if((sumAry[j]-sumAry[i]) <= upper && (sumAry[j]-sumAry[i]) >= lower){
                    count++;
                }
            }

        }
        return count;
    }
//    public int countRangeSum(int[] nums, int lower, int upper) {
//
//        if(nums.length==0){
//            return 0;
//        }
//        int len = nums.length;
//        //建立邻接表     测试用例Integer.MAX_VALUE会溢出
//        long[][] dp = new long[len][len];
//
//        //对角线填充
//        for (int i = 0; i < len; i++) {
//            dp[i][i] = nums[i];
//        }
//        int count = 0;
//        //区间和填充
//        for (int i = 0; i < len; i++) {
//            for (int j = i; j < len; j++) {
//                if(j>i){
//                    dp[i][j] = dp[i][j-1]+dp[j][j];
//                    if(dp[i][j]>=lower && dp[i][j]<=upper){
//                        count++;
//                    }
//                }
//                if(i==j && dp[i][j]>=lower && dp[i][j]<=upper){
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }
}
