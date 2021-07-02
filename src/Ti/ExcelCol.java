package Ti;

import java.util.Stack;

public class ExcelCol {

    public static void main(String[] args) {

        String s = "ZZZZZZZZZZY";
        int r = new ExcelCol().titleToNumber(s);
        System.out.println(r);

    }

    public int titleToNumber(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> cs = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            cs.push(chars[i]);
        }

        int sum = 0;
        int c = 0;
        while (!cs.isEmpty()){
            int t = (cs.pop() +1 -'A') * ((int)Math.pow(26,c));
            sum+=t;
            c++;
        }


        return sum;
    }


}
