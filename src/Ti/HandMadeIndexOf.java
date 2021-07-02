package Ti;

public class HandMadeIndexOf {
    /**
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle
     * 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     */
    public static void main(String[] args) {

        int n = 50;
        System.out.println(Integer.toBinaryString(n));
        int ans=0;
        while(n>0)
        {
            ans++;
            n&=n-1;
        }
        System.out.println(ans);

//        String haystack = "mississippi";
//        String needle = "issipi";
//
//        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if("".equals(needle)){
            return 0;
        }
        if ("".equals(haystack)){
            return -1;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        boolean maybe = false;
        char[] c1 = haystack.toCharArray();
        char[] c2 = needle.toCharArray();
        for (int i = 0; i < c1.length ; i++) {
            if(c1[i] == c2[0]){
                maybe = true;
                for (int j = 1; j < c2.length; j++) {
                    if(((i+j)>=c1.length)||c1[i+j]!=c2[j]){
                        maybe = false;
                        break;
                    }
                }
                if(maybe){
                    return i;
                }
            }
        }
        return -1;
    }
}
