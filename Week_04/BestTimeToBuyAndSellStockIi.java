public class BestTimeToBuyAndSellStockIi {
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStockIi().new Solution();
        int[] prices_1 = {7, 1, 5, 3, 6, 4}; // 7
        int[] prices_2 = {1, 2, 3, 4, 5}; // 4
        int[] prices_3 = {7, 6, 4, 3, 1}; // 0
        System.out.println(solution.maxProfit(prices_1));
        System.out.println(solution.maxProfit(prices_2));
        System.out.println(solution.maxProfit(prices_3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int max_sum = 0;
            // 亏损不买卖，上涨趋势最大的利润等于每天的利润之和
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    max_sum += prices[i] - prices[i - 1];
                }
            }
            return max_sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}