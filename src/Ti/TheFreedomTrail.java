//package Ti;
//
//import java.util.*;
//
//public class TheFreedomTrail {
//
//    /**
//     给定一个字符串 ring，表示刻在外环上的编码；给定另一个字符串 key，表示需要拼写的关键词。
//     您需要算出能够拼写关键词中所有字符的最少步数。
//
//     最初，ring 的第一个字符与12:00方向对齐。您需要顺时针或逆时针旋转 ring
//     以使 key 的一个字符在 12:00 方向对齐，然后按下中心按钮，以此逐个拼写完 key 中的所有字符
//
//     */
//    public static void main(String[] args) {
//
//        String ring = "godding";
//        String key = "gd";
//        int result = new TheFreedomTrail().findRotateSteps(ring,key);
//        System.out.println(result);
//    }
//
//    public int findRotateSteps(String ring, String key) {
//        int len = ring.length()-1;
//        char[] vertex = ring.toCharArray();
//        Map<Integer,List<Integer>> edge = new HashMap<>();
//        for (int i = 0; i < len; i++) {
//            List<Integer> tempList = new ArrayList<>();
//            if(i-1>0){
//                tempList.add(i-1);
//            }
//            if(i+1<=len){
//                tempList.add(i+1);
//            }
//        }
//
//        Map<Integer,List<Integer>> resultMap = new HashMap<>();
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(0);
//        while (!queue.isEmpty()){
//            if(queue){}
//        }
//
//
//    }
//
//}
