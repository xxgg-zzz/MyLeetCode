package Ti;

public class BestOpportunity {

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

     设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

     注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     */
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        int result = new BestOpportunity().maxProfit(prices);
        System.out.println(result);
    }
    public int maxProfit(int[] prices) {

        //只有一个的话当天买当天卖收益为0；
        if (prices.length==1){
            return 0;
        }

        //获取隔天卖能获取的利润。
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += prices[i]-prices[i-1] > 0 ?  prices[i]-prices[i-1]:0;
        }
        return profit;
    }

}
