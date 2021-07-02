package Ti;

import java.util.ArrayList;
import java.util.List;

public class MargeSection {

    /**
     * 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
        在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠
     （如果有必要的话，可以合并区间）。
     */

    public static void main(String[] args) {

        int[][] intervals = {{1,5}};
        int[] newInterval = {0,0};
        int[][] result = new MargeSection().insert(intervals,newInterval);
        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i][0]+"-"+result[i][1]);

        }

    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        if (newInterval.length==0){
            return intervals;
        }
        if(intervals.length==0){
            return new int[][]{newInterval};
        }

        boolean hasMarge = false;
        boolean hasAdd = false;
        for (int i = 0; i < intervals.length; i++) {

            if(intervals[i][0]>newInterval[1]){
                if(!hasAdd){
                    list.add(newInterval);
                    hasAdd = true;
                }
                list.add(intervals[i]);
            }else if(intervals[i][1] < newInterval[0]){

            }
            else{
                newInterval = marge(intervals[i],newInterval);
                if(hasMarge){
                    list.remove(list.size()-1);
                    list.add(newInterval);
                }else{
                    list.add(newInterval);
                    hasMarge = true;
                }
                hasAdd = true;
            }
        }
        if(!hasAdd){
            list.add(newInterval);
        }
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;

    }

    private int[] marge(int[] interval, int[] newInterval) {

        return new int[]{Math.min(interval[0], newInterval[0]),Math.max(interval[1],newInterval[1])};

    }

}
