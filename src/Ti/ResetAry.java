package Ti;

import java.util.Arrays;

public class ResetAry {

    public static void main(String[] args) {

        int[] nums = {1,3,5};
        new ResetAry().exchange(nums);
        Arrays.stream(nums).forEach(item-> System.out.println(item));
    }

    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            if(nums[i]%2 == 0){
                i++;
                continue;
            }
            if(nums[j]%2 == 1){
                j--;
                continue;
            }
            int temp;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}
