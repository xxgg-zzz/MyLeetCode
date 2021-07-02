package Ti;

public class FindJudge {
    /**
     *
     小镇的法官不相信任何人。
     每个人（除了小镇法官外）都信任小镇的法官。
     只有一个人同时满足属性 1 和属性 2 。
     */
    public static void main(String[] args) {

        int N = 4;
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int result = new FindJudge().findJudge(N,trust);
        System.out.println(result);
    }

    public int findJudge(int N, int[][] trust) {

        int[][] people = new int[N][2];     //记录出度与入度
        for (int[] person: trust){
            int in = person[1];
            int out = person[0];
            people[out - 1][0]++;
            people[in - 1][1]++;
        }

        for (int i = 0; i < people.length; i++) {
            if(people[i][0]==0 && people[i][1] == N-1){     //所有人都信任法官
                return i+1;
            }
        }
        return -1;
    }
}
