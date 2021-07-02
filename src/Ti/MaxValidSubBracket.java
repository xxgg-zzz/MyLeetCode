package Ti;

public class MaxValidSubBracket {
    /**
     * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
     * @param args
     */

    public static void main(String[] args) {

        String s = "()(())";
        int i = new MaxValidSubBracket().longestValidParentheses(s);
        System.out.println(i);


    }

    public int longestValidParentheses(String s) {

        if(s.length()<=1){
            return 0;
        }

        int len = s.length();
        int[] dp = new int[len];

        int max = 0;
        for (int i = 0; i < len; i++) {
            if(s.charAt(i) == ')' && i-dp[i-1]-2 >= 0 && s.charAt(i-dp[i-1]-1) == '('){
                dp[i] = 2+dp[i-1]+dp[i-dp[i-1]-2];
            }
        }

        for (int i = 0; i < len; i++) {
            max = dp[i]>max?dp[i]:max;
        }
        return max;
    }
}
