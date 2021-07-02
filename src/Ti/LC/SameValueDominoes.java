package Ti.LC;

public class SameValueDominoes {


    public static void main(String[] args) {

        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        int result = new SameValueDominoes().numEquivDominoPairs(dominoes);
        System.out.println(result);

    }

    public int numEquivDominoPairs(int[][] dominoes) {

        int[] key = new int[100];

        int result = 0;


        for (int i = 0; i < dominoes.length; i++) {

            int val = dominoes[i][0] < dominoes[i][1] ? dominoes[i][0]*10+dominoes[i][1]:dominoes[i][1]*10+dominoes[i][0];
            result+=key[val];
            key[val]++;

        }

        return result;



    }
}
