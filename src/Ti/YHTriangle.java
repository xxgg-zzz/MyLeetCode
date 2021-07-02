package Ti;

import java.util.ArrayList;
import java.util.List;

public class YHTriangle {

    /**
     * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。

     在杨辉三角中，每个数是它左上方和右上方的数的和。
     */
    public static void main(String[] args) {
        int k = 3;

        new YHTriangle().getRow(k).forEach(System.out::println);

    }


    /**
     * 获取杨辉三角的指定行
     * 组合公式C(n,i) = n!/(i!*(n-i)!)
     * 则后项是前项的x倍  ==>(n! / ((i+1)! * (n-(i+1))!)) / (n! / (i! * (n-i))!) ==>(n-i)/(i+1)
     * i = 0时 值为1
     */

    public List<Integer> getRow(int rowIndex) {
        //杨辉三角第N行 共N+1个元素
        List<Integer> yhList = new ArrayList<>(rowIndex+1);
        long cur = 1;
        for (int i = 0; i <= rowIndex ; i++) {
            yhList.add((int) cur);
            cur = cur*(rowIndex-i)/(i+1);
        }
        return yhList;
    }

//    private int factorial(int n){
//        //假设不会小于0
//        if(n == 0){
//            return 1;
//        }
//        int res = 1;
//        for (int i = 1; i <=n ; i++) {
//            res*=i;
//        }
//        return res;
//    }


//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> result = Arrays.asList(1);
//
//        if(rowIndex == 1){
//            return result;
//        }
//
//        for (int i = 1; i <= rowIndex ; i++) {
//
////            List<Integer> temp = new ArrayList<>(i+1);  //数组的长度为下标加一
//
//            int[] temp = new int[i+1];
//
//            for (int j = 0; j < i+1; j++) {
//                if (j == 0 || j == temp.length -1){
//                    temp[j] = 1;
//                    continue;
//                }
//                temp[j] = result.get(j-1)+result.get(j);
//            }
//
//            result = Arrays.stream(temp).boxed().collect(Collectors.toList());
//
//        }
//
//        return result;
//
//    }

}

