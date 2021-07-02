package Ti;

import java.util.Arrays;

public class NumOfLife {

    public static void main(String[] args) {

        int[] birth = {1900, 1901, 1950};
        int[] death = {1948, 1951, 2000};

        int r = new NumOfLife().maxAliveYear(birth,death);
        System.out.println(r);

    }


    public int maxAliveYear(int[] birth, int[] death) {
        int len = birth.length;
        int[][] life = new int[len][2];
        for(int i = 0; i < len; i++){
            life[i][0] = birth[i];
            life[i][1] = death[i];
        }

        Arrays.sort(life,(o1,o2)->Integer.compare(o1[1],o2[1]));

        int count = 0;
        int max = 0;

        int pre = life[0][1];
        int result = life[0][1];
        for(int i = 0; i < len; i++){

            if(life[i][0]<=pre){
                count++;
            }else{
                pre = life[i][1];
                if(max < count){
                    max = count;
                }
                count = 0;

            }

        }
        return result;
    }
}
