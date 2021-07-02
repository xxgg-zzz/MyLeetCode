package Ti.LC;

import java.util.Arrays;

public class VisitAllPoint {


    public static void main(String[] args) {

        int[][] points = {{1,1},{3,4},{-1,0}};
        int r = new VisitAllPoint().minTimeToVisitAllPoints(points);
        System.out.println(r);

    }


    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length==1){
            return findDistance(points);
        }
        int[][] distanceAry = new int[points.length-1][2];

        for (int i = 1; i < points.length; i++) {
            distanceAry[i-1][0] = Math.abs(points[i][0] - points[i-1][0]);
            distanceAry[i-1][1] = Math.abs(points[i][1] - points[i-1][1]);
        }
        return findDistance(distanceAry);


    }

    public int findDistance(int[][] ary) {
        int result = 0;

        for(int[] arr : ary){
            result += arr[0]>arr[1] ? arr[0]:arr[1];
        }
        return result;

    }

}
