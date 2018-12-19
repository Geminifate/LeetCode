public class Solution {
	//========画个折线图容易理解
    public int maxProfit(int[] prices) {
    	int max_profit=0;
        for (int i = 1; i < prices.length; i++) {
			if (prices[i]>prices[i-1]) {
				max_profit+=(prices[i]-prices[i-1]);
			}
		}
        return max_profit;
    }
}
