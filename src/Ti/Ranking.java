package Ti;

public class Ranking {
    /**
     * 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。
     * 前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。
     (注：分数越高的选手，排名越靠前。)
     */
    public static void main(String[] args) {
        int[] num = {2, 4, 1, 5, 3};
        String[] result = new Ranking().findRelativeRanks(num);
        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
        }

    }

    public String[] findRelativeRanks(int[] nums) {
        quickSort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        return new String[0];
    }

    private void quickSort(int[] nums, int i, int j) {
        int start = i;
        int end = j;
        if(start>=end){
            return;
        }
        int key = nums[i];
        while (start<end){
            while (nums[start]<=key && start<end){
                start++;
            }
            while (nums[end]>=key && start<end){
                end--;
            }
            if(start<end){
                int temp;
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
        //基准值与较小值交换
        nums[i] = nums[start];
        nums[start] = key;
        quickSort(nums,i,start-1);
        quickSort(nums,start+1,j);
    }
}
