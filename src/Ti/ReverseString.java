package Ti;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String s = new String("  Bob    Loves  Alice   ");
        String result = new ReverseString().reverseWords(s);
        System.out.println(result);

    }


    public String reverseWords(String s) {
        if(s==null||s.trim().length()==0){
            return "";
        }
        String[] strs = s.trim().split("\\s+");
        int begin = 0;
        int end = strs.length-1;
        while (end>begin){
            String temp;
            temp = strs[begin];
            strs[begin] = strs[end];
            strs[end] = temp;
            end--;
            begin++;
        }
        return String.join(" ",strs);
    }
}
