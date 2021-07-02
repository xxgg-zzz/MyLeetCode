package Ti;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    /**
     * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
     */

    public static void main(String[] args) {

//        n = 4, k = 2
        int n = 4;
        int k = 2;
        List<List<Integer>> result = new Combine().combine(n,k);

        result.forEach(item->{
            System.out.println();
            item.forEach(it-> System.out.print(it+" "));});

    }

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();

        backTrace(1,n,k,new ArrayList<Integer>(),result);
        return result;
    }

    private void backTrace(int r,int n, int k, ArrayList<Integer> objects, List<List<Integer>> result) {

        if(objects.size()==k){
            result.add(new ArrayList<>(objects));
            return;
        }

        for (int i = r; i <= n; i++){
            objects.add(i);
            backTrace(i+1,n,k,objects,result);
            objects.remove(objects.size()-1);
        }
    }


}
