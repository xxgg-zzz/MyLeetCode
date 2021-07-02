package Ti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class YangHuiTre {

    public static void main(String[] args) {

//        int numsRows = 10;
//        new YangHuiTre().generate(numsRows).stream().forEach(item->{
//            item.forEach(System.out::print);
//            System.out.println();
//        });

        StringBuffer sb = new StringBuffer();
        sb.toString().equals(sb.reverse().toString());

    }

    public List<List<Integer>> generate(int numRows) {

        if(numRows==0){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            Integer[] k = new Integer[i];
            if(i<=2){

                Arrays.fill(k,1);
                res.add(Arrays.asList(k));
                continue;
            }

            k[0] = 1;
            k[k.length-1] = 1;
            List<Integer> preList = res.get(res.size()-1);
            for (int j = 1; j < preList.size(); j++) {
                k[j] = preList.get(j)+preList.get(j-1);
            }
            res.add(Arrays.asList(k));
        }
        return res;
    }
}
