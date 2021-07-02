package Ti;

public class MySqrt {
    /**
     * 实现 int sqrt(int x) 函数。
     计算并返回 x 的平方根，其中 x 是非负整数。
     由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
     */
    public static void main(String[] args) {

        int x = 2147483647;
        int r = new MySqrt().mySqrt(x);
        System.out.println(r);

    }

    public int mySqrt(int x) {
        if (x == 1){
            return 1;
        }
        int start = 0;
        int end = x;
        while (end-start>1){
            int mid = (end+start)/2;
            if(x/mid>mid){
                start = mid;
            }else if(x/mid==mid){
                return mid;
            }else{
                end = mid;
            }

        }
        return start;
    }

}
