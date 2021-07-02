package Ti;

import java.util.Arrays;

public class HighCitations {

    /**
     * h 代表“高引用次数”（high citations），
     * 一名科研人员的 h 指数是指他（她）的 （N 篇论文中）
     * 总共有 h 篇论文分别被引用了至少 h 次。
     * （其余的 N - h 篇论文每篇被引用次数 不超过 h 次。）
     *
     * 题目有点晦涩 大概意思是找到数组中的一个数，这个数等于数组中大于等于该数的数的个数
     * @param citations
     * @return
     */
    public static void main(String[] args) {

        int[] citations = {3,0,6,1,5};
        int result = new HighCitations().hIndex(citations);
        System.out.println(result);

    }

    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        // 线性扫描找出最大的 i
        int i = 0;
        while (i < citations.length && citations[citations.length - 1 - i] > i) {
            i++;
        }
        return i;

//        int len = citations.length;
//        int[] citationsCounts = new int[len];
//        Arrays.fill(citationsCounts,1);
//
//        for (int i = 1; i < len; i++) {
//            for (int j = i; j >= 0 ; j--) {
//                if(citations[i] > citations[j]){
//                    citationsCounts[j]++;
//                }
//                if(citations[i] == citations[j]){
//                    citationsCounts[i]++;
//                    citationsCounts[j]++;
//                }
//            }
//        }
//
//        int max = 0;
//        for (int i = 0; i < len; i++) {
//
//            if (citationsCounts[i] == citations[i]){
//
//                max = citationsCounts[i] > max ? citationsCounts[i] : max;
//
//            }
//
//        }
//
//        return max;

    }
}
