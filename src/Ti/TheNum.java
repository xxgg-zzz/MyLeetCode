package Ti;

public class TheNum {

    public static void main(String[] args) {

        int r = new TheNum().findNthDigit(300);
        System.out.println(r);

    }

    public int findNthDigit(int n) {
        if(n < 10) return n;
        int k = 0;
        int num = 9;
        while(num*k<n){
            num *= 10;
            k++;
        }
        num = num/10;
        int c = 1;
        for(int i = 0; i < k-1; i++){
            c = c*10;
        }
        return (num - c) % k;
    }
}
