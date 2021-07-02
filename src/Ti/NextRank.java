package Ti;

public class NextRank {
    /**
     *实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
     如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
     必须原地修改，只允许使用额外常数空间。
     */
    public static void main(String[] args) {

        int[] nums = {3,2,1};
        new NextRank().nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public void nextPermutation(int[] nums) {
        if (nums.length==1){
            return;
        }

        boolean kFlag = false;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                kFlag = true;
            }
        }
        if(!kFlag){
            int start = 0;
            int end = nums.length-1;
            while (end > start){
                int temp;
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end --;
                start++;
            }
        }else{
            int start = nums.length-1;
            int end = nums.length-2;
            while (end >= 0){
                if(nums[start] > nums[end]){
                    int temp;
                    temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    return;
                }else{
                    start--;
                    end --;
                }
            }
        }

    }
}
