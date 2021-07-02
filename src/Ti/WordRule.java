package Ti;

import java.util.HashMap;
import java.util.Map;

public class WordRule {

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean b = new WordRule().wordPattern(pattern,s);
        System.out.println(b);

    }

    public boolean wordPattern(String pattern, String s) {

        Map<String,Character> vMap = new HashMap<>();
        Map<Character,String> kMap = new HashMap<>();

        char[] chars = pattern.toCharArray();
        String[] ss = s.split(" ");
        if (chars.length!=ss.length){
            return false;
        }

        for(int i = 0; i < ss.length; i++){

            if(vMap.containsKey(ss[i])
                    &&!vMap.get(ss[i]).equals(chars[i])
                    ||kMap.containsKey(chars[i])
                    &&!kMap.get(chars[i]).equals(ss[i])
                    ){
                return false;
            }
            kMap.put(chars[i],ss[i]);
            vMap.put(ss[i],chars[i]);

        }

        return true;

    }

}
