package Ti;

import java.util.*;

public class KOfAry {

    /**
     * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
     按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
     "123"
     "132"
     "213"
     "231"
     "312"
     "321"
     给定 n 和 k，返回第 k 个排列。
     */

    public static void main(String[] args) {
        int n = 4;
        int k = 9;
        String s = new KOfAry().getPermutation(n,k);
        System.out.println(s);

    }
    public String getPermutation(int n, int k) {
        int[] factorial = new int[n];
        factorial[0] = 1;
        for(int i=1;i<n;i++){
            factorial[i] = factorial[i -1] * i;
        }

        StringBuilder builder = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        while(nums.size() != 0){
            int group = k / factorial[n -1];
            int index = k % factorial[n -1];

            Integer target = (index == 0) ? nums.get((group -1) % n) : nums.get(group % n);

            builder.append(target);
            nums.remove(target);
            n--;
        }
        return builder.toString();

    }

}
