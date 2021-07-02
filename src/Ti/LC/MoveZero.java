package Ti.LC;

import java.util.Arrays;

public class MoveZero {


    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        new MoveZero().moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }

    public void moveZeroes(int[] nums) {


    }

}
