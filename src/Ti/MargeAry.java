package Ti;

public class MargeAry {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int r = new MargeAry().removeDuplicates(nums);
        System.out.println(r);

    }

    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        if(n<=2){
            return n;
        }
        int slow = 2;
        int fast = 2;
        while(fast<n){
            if(nums[fast] != nums[slow-2]){
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }

}



