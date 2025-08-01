class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        for (int i =0; i<= n-2; i++){
            if (prices[i]<prices[i+1]){
                maxProfit = maxProfit + (prices[i+1] - prices[i]);
            }
        }
        return maxProfit;
    }
}