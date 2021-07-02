package Ti;

public class MaxSubString {
    /**
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     */

    public static void main(String[] args) {

        String str = "babad";
        String result = new MaxSubString().longestPalindrome(str);
        System.out.println(result);

    }

    public String longestPalindrome(String str) {

        int n = str.length();
        String result = "";

        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                int l = j+i;
                if(i == 0){
                    dp[j][l] = true;
                }else if(i == 1){
                    dp[j][l] = (str.charAt(j) == str.charAt(l));
                }else{
                    dp[j][l] = (str.charAt(j) == str.charAt(l)) && dp[j+1][l-1];
                }

                if(dp[j][l] && i+1 > result.length()){
                    result = str.substring(j,j+i+1);
                }
            }
        }

        return result;



    }

}
