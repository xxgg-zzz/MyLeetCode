package Ti;

import java.util.Stack;

public class MinOfJump {
    /**
     * 给定一个非负整数数组，你最初位于数组的第一个位置。
     * <p>
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * <p>
     * 你的目标是使用最少的跳跃次数到达数组的最后一个位置
     */

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 1, 4};
        int i = new MinOfJump().jump(nums);
        System.out.println(i);

    }

    public int jump(int[] nums) {
        //贪心算法 O(N*N)
//        int position = nums.length-1;
//        int steps = 0;
//
//        Stack<Integer> stack = new Stack<>();
//        stack.add(nums[position]);
//
//        while (position>0){
//
//            for (int i = 0; i < position; i++) {
//
//                if(nums[i]+i >= position){
//                    position = i;
//                    stack.add(nums[i]);
//                    steps++;
//                    break;
//                }
//
//            }
//
//        }
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop()+"->");
//        }
//        return steps;
        //优化O(N)

        int steps = 0;
        int maxPosition = 0;
        int end = 0;
        for (int i = 0; i < nums.length-1; i++) {

            maxPosition = Math.max(maxPosition,nums[i]+i);
            if(i == end){
                steps++;
                end = maxPosition;
            }


        }
        return steps;


    }
}
