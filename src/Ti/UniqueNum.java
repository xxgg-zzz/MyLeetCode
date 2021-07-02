package Ti;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNum {

    public static void main(String[] args) {

        int[] nums = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean flag = new UniqueNum().uniqueOccurrences(nums);
        System.out.println(flag);


    }

    public boolean uniqueOccurrences(int[] arr) {

        int len = arr.length;

        int[] nums = new int[2001];
        for (int i = 0; i < len; i++) {
            nums[arr[i]+1000]++;
        }
        Set<Integer> keySet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {
                continue;
            }
            if (keySet.contains(nums[i])){
                return false;
            }
            keySet.add(nums[i]);

        }

        return true;
    }

}
