package Ti;

public class Capital {
    /**
     * 给定一个单词，你需要判断单词的大写使用是否正确。

     我们定义，在以下情况时，单词的大写用法是正确的：

     全部字母都是大写，比如"USA"。
     单词中所有字母都不是大写，比如"leetcode"。
     如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。

     否则，我们定义这个单词没有正确使用大写字母。
     */
    public static void main(String[] args) {

        String word = "GooGle";
        boolean result = new Capital().detectCapitalUse(word);
        System.out.println(result);

    }

    public boolean detectCapitalUse(String word) {
        int capital = 0;
        for (int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                capital++;
            }
        }
        if(capital==0||capital == word.length()){
            return true;
        }
        if (capital == 1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;


//        if(word.equals(word.toUpperCase())){
//            return true;
//        }
//        if(word.equals(word.toLowerCase())){
//            return true;
//        }
//        boolean isFirst = false;
//        if(Character.isUpperCase(word.charAt(0))){
//            isFirst = true;
//        }
//        if(isFirst){
//            for (int i = 1; i < word.length(); i++) {
//                if(Character.isUpperCase(word.charAt(i))){
//                    return false;
//                }
//            }
//            return true;
//        }
//        return false;
    }

}
