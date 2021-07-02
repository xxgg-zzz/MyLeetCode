package Ti;

import java.util.Arrays;

public class MoveZero {

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * @param args
     */

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        new MoveZero().moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }

    public void moveZeroes(int[] nums) {

        //双指针寻找第一个0和第一个不为0的数，然后交换，类似于赶气泡

        if (nums.length <= 1) {
            return;
        }
        int n = nums.length;
        int i = 0;
        int j = 0;
        while (j < n) {

            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
            j++;

        }

    }

    private void swap(int[] nums, int i, int j) {

        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
