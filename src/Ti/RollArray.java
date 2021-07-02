package Ti;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class RollArray {

    //给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 10;
        new RollArray().rotate(nums,k);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseAry(nums,0,nums.length-1);
        reverseAry(nums,0,k-1);
        reverseAry(nums,k,nums.length-1);

    }
    private void reverseAry(int[] nums, int start,int end){

        while (end>start){
            int temp;
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }

    }

}
