package Ti;

public class SumOfTwoNum_1 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7};
        int target = 13;
        SumOfTwoNum_1 son = new SumOfTwoNum_1();
        int[] result = son.twoSum(nums,target);
        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);

        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        a:for(int i = 0; i < nums.length; i++){
            b:for(int j = i+1; j<nums.length; j++){

                if(nums[i]+nums[j] == target ){
                    result[0] = i;
                    result[1] = j;
                    break a;
                }

            }
        }

        return result;
    }

}
