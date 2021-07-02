package Ti.LC;

public class FindWinner {


    public static void main(String[] args) {

        int[] arr = {2,1,3,5,4,6,7};
        int k = 3;
        int result = new FindWinner().getWinner(arr,k);
        System.out.println(result);
    }

    public int getWinner(int[] arr, int k) {
        if(k==1){
            return Math.max(arr[0],arr[1]);
        }
        int pre = 0;
        int count = 0;
        int cur = 1;
        for(int i = 1; i < arr.length; i++){
            cur = i;
            if(arr[pre]>arr[cur]){
                count++;
            }else{
                pre = i;
                count = 1;
            }

            if(count==k){
                break;
            }


        }
        return arr[pre];
    }


}
