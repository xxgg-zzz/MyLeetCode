package Ti;

public class ReverseStrOnly {
    /**
     * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
     */
    public static void main(String[] args) {

        String sre = "a-bC-dEf-ghIj";
        String result = new ReverseStrOnly().reverseOnlyLetters(sre);
        System.out.println(result);

    }

    public String reverseOnlyLetters(String S) {
        if(S.length()<=1){
            return S;
        }
        char[] inputChar = S.toCharArray();
        StringBuffer sb = new StringBuffer();
        int start = 0;
        int end = S.length()-1;
        while (end > start){
            while (end>start){
                char startc = inputChar[start];
                if((startc<='z'&&startc>='a')||(startc>='A'&&startc<='Z')){
                    break;
                }
                start++;
            }
            while (end>start){
                char endc = inputChar[end];
                if((endc<='z'&&endc>='a')||(endc>='A'&&endc<='Z')){
                    break;
                }
                end--;
            }

            char temp;
            temp = inputChar[start];
            inputChar[start] = inputChar[end];
            inputChar[end] = temp;
            start++;
            end--;
        }
        return new String(inputChar);
    }

}
