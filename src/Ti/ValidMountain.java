package Ti;

public class ValidMountain {
    /**
     * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
     */

    public static void main(String[] args) {

        int[] a = {1,3,2};
        boolean flag = new ValidMountain().validMountainArray(a);
        System.out.println(flag);

    }


    public boolean validMountainArray(int[] A) {

        int len = A.length-1;
        int i = 0;
        int j = len;

        //从左往右找最大值；
        while (i+1<=len && A[i]< A[i+1]){
            i++;
        }

        while (j>0 && A[j]<A[j-1]){
            j--;
        }

        return i==j && i>0 && j < len;
    }
}
