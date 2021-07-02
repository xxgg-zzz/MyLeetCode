package Ti;

import java.util.Arrays;

public class Plus1 {

    public static void main(String[] args) {

        int[] digits = {9,9,9,9};
        int[] result = new Plus1().plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }

    public int[] plusOne(int[] digits) {
        boolean carryFlag = true;
        for (int i = digits.length-1; i >=0; i--){

            if(carryFlag){
                if ((digits[i]+1) < 10){
                    carryFlag = false;
                    digits[i] = digits[i]+1;
                }else{
                    digits[i] = (digits[i]+1)%10;
                }
            }
        }
        if (carryFlag){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i = 0; i < digits.length ; i++) {
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
