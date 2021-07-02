package Ti;

import java.util.LinkedList;

public class SlidingWindows {

    /**
     * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
     */

    public static void main(String[] args) {
       int[] nums = {1,-1};
       int k = 1;
       int[] result = new SlidingWindows().maxSlidingWindow(nums,k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int index = 0;
        int len = nums.length;
        int[] result = new int[len-k+1];
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(i);
            if(queue.peekFirst()<=i-k){
                queue.pollFirst();
            }

            if(i>=k-1){
                result[index++] = nums[queue.peekFirst()];
            }

        }
        return result;

    }
}
