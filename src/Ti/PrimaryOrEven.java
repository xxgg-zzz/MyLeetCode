package Ti;

public class PrimaryOrEven {
    /**
     * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
     对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
     你可以返回任何满足上述条件的数组作为答案。
     */
    public static void main(String[] args) {
        int[] A = {4,2,5,7};
        int[] result = new PrimaryOrEven().sortArrayByParityII(A);
        for (int i = 0; i < result.length; i++) {
            System.out.print( result[i] );
        }
    }

    public int[] sortArrayByParityII(int[] A) {
        int left = 0;
        int right = 1;
        while (true){
            while (right<A.length){
                if(A[right]%2==1){
                    right+=2;
                }else{
                    break;
                }
            }
            while (left<A.length){
                if(A[left]%2==0){
                    left+=2;
                }else{
                    break;
                }
            }
            if(right<A.length&&left<A.length){
                int temp;
                temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                right+=2;
                left+=2;
            }else {
                break;
            }
        }
        return A;
    }
}
