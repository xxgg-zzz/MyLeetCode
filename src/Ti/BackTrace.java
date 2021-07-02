package Ti;

import java.util.ArrayList;
import java.util.List;

public class BackTrace {

    private static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {

        int[] nums = {1,2,3};

        backTrace(nums,new ArrayList<>());
        for (int i = 0; i < result.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < result.get(j).size(); j++) {

                System.out.print(result.get(i).get(j));

            }
            System.out.println("]");

        }

    }

    private static void backTrace(int[] nums, ArrayList<Integer> integers) {

        if(integers.size()==nums.length){
            result.add(new ArrayList<>(integers));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(integers.contains(nums[i])){
                continue;
            }
            integers.add(nums[i]);
            backTrace(nums,integers);
            integers.remove(integers.size()-1);
        }

    }

}
