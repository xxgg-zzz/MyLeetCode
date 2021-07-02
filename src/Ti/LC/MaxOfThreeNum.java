package Ti.LC;

import java.util.Arrays;

public class MaxOfThreeNum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int r = new MaxOfThreeNum().maximumProduct(arr);
        System.out.println(r);

    }


    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length-1;
        return Math.max(nums[0]*nums[1]*nums[len],nums[len]*nums[len-1]*nums[len-2]);

    }


}
