package Ti;

import java.util.Arrays;

public class JumpGame {

    public static void main(String[] args) {

//        int[] nums = {2,3,1,1,4};
//        int r  = new JumpGame().jump(nums);
//        System.out.println(r);
        String s = new String(new byte[] { (byte) 0xEF, (byte) 0xBB,(byte) 0xBF });
        System.out.println(s);

    }

    public int jump(int[] nums) {
        int n = nums.length;
        int end = 0;
        int maxPosition = 0;
        int step = 0;
        for (int i = 0; i < n-1; i++) {

            maxPosition = Math.max(maxPosition,1+nums[i]);
            if(i == end){
                end = maxPosition;
                step++;
            }

        }
        return step;

    }

}
