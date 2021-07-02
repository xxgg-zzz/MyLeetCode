package Ti;

public class RemoveRepeat {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1,3};
        int val = 1;
        int i = removeElement(nums,val);
        System.out.println(i);

    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if(nums[j] != val){
                nums[i++] = nums[j];
            }

        }
        return i;
    }

}
