package Ti;

import java.util.*;

public class SortByNumOf1 {


    /**
     * 给你一个整数数组 arr 。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。

     如果存在多个数字二进制中 1 的数目相同，则必须将它们按照数值大小升序排列。

     */
    public static void main(String[] args) {

        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] result = new SortByNumOf1().sortByBits(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public int[] sortByBits(int[] arr) {
        //输入数组中1的个数 数组
        List<Integer> cList = new ArrayList<>();
        Map<Integer,List<Integer>> kMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int c = countNumOf1(arr[i]);
            if (kMap.containsKey(c)){
                List<Integer> tempList = kMap.get(c);
                tempList.add(arr[i]);
                kMap.put(c,tempList);
            }else{
                List<Integer> tempList = new ArrayList<>();
                tempList.add(arr[i]);
                kMap.put(c,tempList);
                cList.add(c);
            }
        }
        int[] result = new int[arr.length];
        Collections.sort(cList);
        int resultIndex = 0;
        for (int i = 0; i < cList.size(); i++) {
            List<Integer> sortList = kMap.get(cList.get(i));
            Collections.sort(sortList);
            for (int j = 0; j < sortList.size(); j++) {
                result[resultIndex++] = sortList.get(j);
            }
        }
        return result;
    }

    private int countNumOf1(int i) {
        int c = 0;
        while (i!=0){
            i = i & (i-1);
            c++;
        }

        return c;
    }


}
