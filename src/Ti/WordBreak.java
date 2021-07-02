//package Ti;
//
//import java.util.*;
//
//public class WordBreak {
//    /**
//     * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，
//     * 在字符串中增加空格来构建一个句子，
//     * 使得句子中所有的单词都在词典中。返回所有这些可能的句子。
//     说明：
//
//     分隔时可以重复使用字典中的单词。
//     你可以假设字典中没有重复的单词。
//     */
//    public static void main(String[] args) {
//
//        String s = "catsanddog";
//        List<String> wordDict = Arrays.asList(new String[]{"cat", "cats", "and", "sand", "dog"});
//
//        List<String> result = new WordBreak().wordBreak(s,wordDict);
//        result.forEach(item-> System.out.println(item));
//
//    }
//
//    public List<String> wordBreak(String s, List<String> wordDict) {
//        List<String> result = new ArrayList<>();
//        Set<String> dict = new HashSet<>(wordDict);
//
//        StringBuffer sb = new StringBuffer(s);
//        backTrace(s,dict,sb,result);
//        return result;
//    }
//
//    private void backTrace(String s, Set<String> dict, StringBuffer sb, List<String> result) {
//        StringBuffer sb2 = new StringBuffer();
//        for (int i = 0; i < sb.length(); i++){
//
//            sb2.append(sb.charAt(i));
//            if(dict.contains(sb2.toString())){
//
//                sb2.append(' ');
//                sb
//
//            }
//
//        }
//
//
//    }
//
//
//}
