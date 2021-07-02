//package Ti;
//
//import java.util.Queue;
//import java.util.concurrent.LinkedBlockingDeque;
//
//public class RegexPattern {
//
//    public static void main(String[] args) {
//
//        String str = "aa";
//        String pattern = "ab*";
//        System.out.println(isMatch(str,pattern));
//
//    }
//
//    private static boolean isMatch(String str,String pattern){
//
//        char[] strChar = str.toCharArray();
//        char[] patternChar = pattern.toCharArray();
//        Queue<Character> queue = new LinkedBlockingDeque<>();
//        for (int i = 0; i < patternChar.length; i++) {
//            queue.add(patternChar[i]);
//        }
//        char c = 0;
//        char c4;
//        for (int i = 0; i < str.length(); i++) {
//
//            c = queue.peek();
//            if(c == '.'){
//                queue.poll();
//                continue;
//            }
//            if(c == '*'){
//                if(strChar[i]==c4){
//                    continue;
//                }else{
//                    queue.poll();
//                }
//            }
//            if(strChar[i]!=c){
//                return false;
//            }
//        }
//
//
//        return true;
//
//    }
//
//}
