package Ti;

public class UpDownString {

    /**
     * 给你一个字符串 s ，请你根据下面的算法重新构造字符串：
     */
    public static void main(String[] args) {

        String s = "aaaabbbbcccc";
        String result = new UpDownString().sortString(s);
        System.out.println(result);

    }

    public String sortString(String s) {
        char[] cary = new char[26];

        for (int i = 0; i < s.length(); i++) {
            cary[s.charAt(i)-'a']++;
        }

        StringBuffer sb = new StringBuffer();

        while(true){

            for (int i = 0; i < cary.length; i++) {
                if(cary[i]!=0){
                    sb.append((char)(i+'a'));
                    cary[i]--;
                }

            }
            if(isClear(cary)){
                break;
            }
            for (int i = cary.length-1; i >= 0 ; i--) {
                if(cary[i]!=0){
                    sb.append((char)(i+'a'));
                    cary[i]--;
                }
            }

            if(isClear(cary)){
                break;
            }

        }
        return sb.toString();

    }

    private boolean isClear(char[] cary) {

        for (int i = 0; i < cary.length; i++) {
            if(cary[i]!=0){
                return false;
            }
        }
        return true;
    }


}
