package Ti;

import java.util.Stack;

public class ValidBracket {
    /**
     * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
     */
    public static void main(String[] args) {

        String s = ")()())";
        int i = new ValidBracket().longestValidParentheses(s);
        System.out.println(i);

    }

    public int longestValidParentheses(String s) {
        Stack<Character> record = new Stack<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                if(!record.isEmpty() && record.peek()=='('){
                    count = 0;
                }
                record.push('(');
            }else{
                if(record.isEmpty()){
                   continue;
                }
                if(record.peek()=='('){
                    record.pop();
                    count+=2;
                }else{
                    while (!record.isEmpty()){
                        record.pop();
                    }
                    count = 0;
                }
                if(count>max){
                    max = count;
                }
            }
        }
        return max;
    }
}
