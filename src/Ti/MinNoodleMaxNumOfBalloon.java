package Ti;

import java.util.Arrays;

public class MinNoodleMaxNumOfBalloon {
    public static void main(String[] args) {

        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        int n = new MinNoodleMaxNumOfBalloon().findMinArrowShots(points);
        System.out.println(n);

    }


    public int findMinArrowShots(int[][] points) {

        if(points.length==0){
            return 0;
        }
        Arrays.sort(points,(p1,p2)->p1[1]<p2[1]?-1:1);

        int n = 1;
        int current = points[0][1];

        for (int i = 0; i < points.length; i++) {

            if(points[i][0]>current){
                n++;
                current = points[i][1];
            }

        }
        return n;

    }
}
