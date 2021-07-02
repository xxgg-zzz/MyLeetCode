package Ti;

import java.util.TreeMap;

public class BeautyUnm {


    public static void main(String[] args) {


//        String s = "aabcbaa";
        String s = "aabcbaa";
        int r = new BeautyUnm().beautySum(s);
        System.out.println(r);


    }

    public int beautySum(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        int totalSum = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            int[] counts = new int[26];
            for (int j = i; j < chs.length; j++) {
                counts[chs[j] - 'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                //26大小，相对来说就是o(1)
                for (int count : counts) {
                    if (count > 0) {
                        max = Math.max(max, count);
                        min = Math.min(min, count);
                    }
                }
                totalSum = totalSum + max - min;
            }
        }
        return totalSum;

    }



}
