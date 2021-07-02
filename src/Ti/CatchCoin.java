package Ti;

public class CatchCoin {
    /**
     * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。
     * 我们每次可以选择任意一堆，拿走其中的一枚或者两枚，
     * 求拿完所有力扣币的最少次数。
     */

    public static void main(String[] args) {
        int[] coins = {2,3,10};
        int i = new CatchCoin().minCount(coins);
        System.out.println(i);

    }

    public int minCount(int[] coins) {
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            count+=(coins[i]+1)/2;
        }
        return count;
    }
}
