package Ti.LC;

import java.util.Arrays;

public class RankAry {

    public static void main(String[] args) {

        int[] arr =  {-4};
        int[] res = new RankAry().sortedSquares(arr);
        Arrays.stream(res).forEach(System.out::println);


    }

    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        int[] res = new int[nums.length];
        int k = nums.length-1;
        while (start<=end){

            if(Math.abs(nums[start])<Math.abs(nums[end])){
                res[k] = nums[end]*nums[end];
                end--;
                k--;
            }else{
                res[k] = nums[start]*nums[start];
                start++;
                k--;
            }

        }
        return res;

    }


}
