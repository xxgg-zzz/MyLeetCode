package Ti;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosest {
    /**
     * 我们有一个由平面上的点组成的列表 points。需要从中找出 K 个距离原点 (0, 0) 最近的点。
     （这里，平面上两点之间的距离是欧几里德距离。）
     */
    public static void main(String[] args) {

        int[][] points = {{-95,76},{17,7},{-55,-58},{53,20},{-69,-8},{-57,87},{-2,-42},{-10,-87},{-36,-57},{97,-39},{97,49}};
        int k = 5;
        int[][] result = new KClosest().kClosest(points,k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0]+"-"+result[i][1]);
        }

    }


    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < points.length; i++) {
            if(i<K){
                pq.add(new int[] {points[i][0]*points[i][1],i});
            }else{
                if(pq.peek()[0] > points[i][0]*points[i][1]){
                    pq.poll();
                    pq.add(new int[] {points[i][0]*points[i][1],i});
                }
            }

        }

        int[][] result = new int[K][2];
        int i = 0;
        while (!pq.isEmpty()){
            result[i++] = points[pq.poll()[1]];
        }
        return result;
    }
}
