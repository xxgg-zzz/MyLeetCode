package Ti;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class ClassRank {
    /**
     * 你总共需要上 n 门课，课程编号依次为 0 到 n-1 。
     有的课会有直接的先修课程，比如如果想上课程 0 ，你必须先上课程 1 ，那么会以 [1,0] 数对的形式给出先修课程数对。
     给你课程总数 n 和一个直接先修课程数对列表 prerequisite 和一个查询对列表 queries 。
     对于每个查询对 queries[i] ，请判断 queries[i][0] 是否是 queries[i][1] 的先修课程。
     请返回一个布尔值列表，列表中每个元素依次分别对应 queries 每个查询对的判断结果。
     */
    public static void main(String[] args) {

        int n = 5;
        int[][] prerequisites = {{0,1},{1,2},{2,3},{3,4}};
        int[][] queries = {{0,4},{4,0},{1,3},{3,0}};
        List<Boolean> result = new ClassRank().checkIfPrerequisite(n,prerequisites,queries);
        result.forEach(item-> System.out.println(item));

    }
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        boolean[][] G = new boolean[n][n];
        for (int i = 0; i < prerequisites.length; i++) {
            G[prerequisites[i][0]][prerequisites[i][1]] = true;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(G[i][k]&&G[k][j]){
                        G[i][j] = true;
                    }
                }
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++){
            result.add(G[queries[i][0]][queries[i][1]]);
        }
         return result;
    }


}
