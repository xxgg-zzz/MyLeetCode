package Ti;

public class UnSortedSubArray {

    /**
     * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，
     * 那么整个数组都会变为升序排序。
     你找到的子数组应是最短的，请输出它的长度。
     */
    public static void main(String[] args) {

        int[] nums = {1,2,4,5,3};
        int i = new UnSortedSubArray().findUnsortedSubarray(nums);
        System.out.println(i);
    }

    public int findUnsortedSubarray(int[] nums) {
        //初始化
        int len = nums.length;
        int min = nums[len-1];
        int max = nums[0];
        int begin = 0, end = -1;
        //遍历
        for(int i = 0; i < len; i++){
            if(nums[i] < max){      //从左到右维持最大值，寻找右边界end
                end = i;
            }else{
                max = nums[i];
            }

            if(nums[len-i-1] > min){    //从右到左维持最小值，寻找左边界begin
                begin = len-i-1;
            }else{
                min = nums[len-i-1];
            }
        }
        return end-begin+1;
//        int start = 0;
//        int end = -1;       //避免原本有序的数组影响结果
//        int len = nums.length;
//        int max = nums[0];
//        int min = nums[len-1];
//        for (int i = 0; i < len; i++) {
//            //右边界
//            if(nums[i] < max){
//                end = i;
//            }else{
//                max = nums[i];
//            }
//            //左边界
//            if(nums[len-i-1] > min){
//                start = len-i-1;
//            }else{
//                min = len-i-1;
//            }
//        }
//
//        return end-start+1;
    }

}
