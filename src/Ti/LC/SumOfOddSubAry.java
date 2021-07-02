package Ti.LC;

public class SumOfOddSubAry {

    public static void main(String[] args) {

//        int[] nums = {1, 4, 2, 5, 3};
//        int r = new SumOfOddSubAry().sumOddLengthSubarrays(nums);
//        System.out.println(r);

        System.out.println(67108864/1024/1024);

    }

    public int sumOddLengthSubarrays(int[] arr) {

        int k = 1;
        int r = 0;
        while (k <= arr.length) {

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (k == 1) {
                    r += arr[i];
                    continue;
                }
                if (i < k-1) {
                    sum += arr[i];
                    continue;
                }
                if (i == k-1) {
                    sum += arr[i];
                    r += sum;
                    continue;
                }
                sum = sum - arr[i - k] + arr[i];
                r += sum;
            }
            k += 2;
        }

        return r;

    }

}
