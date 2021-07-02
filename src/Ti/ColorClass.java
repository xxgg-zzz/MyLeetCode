package Ti;

public class ColorClass {
    /**
     * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，
     * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
     * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
     */
    public static void main(String[] args) {

        int[] nums = {1,2,1,1,0,0,0,2, 0, 2, 1, 1, 0};
        new ColorClass().sortColors(nums);
    }

    public void sortColors(int[] nums) {
        int l = nums.length;
        int r = 0;
        int w = nums.length - 1;
        int cr = 0;
        int cw = nums.length - 1;
        int temp;
        while (r < l) {
            if (nums[r] == 0) {

                temp = nums[r];
                nums[r] = nums[cr];
                nums[cr] = temp;
                cr++;
            }
            r++;
        }
        while (w >= 0) {
            if (nums[w] == 2) {
                temp = nums[w];
                nums[w] = nums[cw];
                nums[cw] = temp;
                cw--;
            }
            w--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
