package Ti;

public class LengthOfLastWord {
    /**
     * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
     * 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
     如果不存在最后一个单词，请返回 0 。
     说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
     */
    public static void main(String[] args) {

        String s = "  ";
        int i = new LengthOfLastWord().lengthOfLastWord(s);
        System.out.println(i);

    }

    public int lengthOfLastWord(String s) {
        int c = 0;
        boolean isWord = true;
        for (int i = s.length()-1; i >= 0 ; i--) {
            if(s.charAt(i) == ' '){
                isWord = false;
                if (c > 0){
                    return c;
                }
            }else{
                isWord = true;
            }
            if(isWord){
                c++;
            }
        }
        return c;

    }

}
