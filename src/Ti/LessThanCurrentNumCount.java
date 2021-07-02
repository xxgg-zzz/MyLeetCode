package Ti;

public class LessThanCurrentNumCount {

    /**
     给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
     换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，
     其中 j 满足 j != i 且 nums[j] < nums[i] 。
     以数组形式返回答案。
     */

    public static void main(String[] args) {

        int[] nums = {8,1,2,2,3};
        int[] result = new LessThanCurrentNumCount().smallerNumbersThanCurrent(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int len = nums.length;
        int[] result = new int[len];

        for (int i = 1; i < len; i++) {
            for (int j = i; j >=0 ; j--) {

                if (nums[i] > nums[j]){
                    result[i]++;
                }

                if(nums[i] < nums[j]){
                    result[j]++;
                }


            }

        }
        return result;

    }

}
