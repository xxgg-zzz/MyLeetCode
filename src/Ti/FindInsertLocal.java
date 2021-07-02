package Ti;

public class FindInsertLocal {
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     你可以假设数组中无重复元素。
     */

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,6,7,8,9,10,11,12};
        int target = 5;

        int i = searchInsert(nums,target);
        System.out.println(i);

    }
    public static int searchInsert(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }

        int start = 0;
        int end = nums.length;
        int mid = (end - start)/2;
        while(start<end){
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]>target){
                end = mid;
                mid = mid-(end - start)/2;
            }
            if(nums[mid]<target){
                start = mid;
                mid = mid+(end - start)/2;
            }
            if(end-start==1){
                return start+1;
            }
        }
        return -1;
    }
}
