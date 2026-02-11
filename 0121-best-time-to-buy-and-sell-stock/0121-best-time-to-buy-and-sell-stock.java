class Solution {
    public int maxProfit(int[] prices) {
        // technique to buy on first day and then che
        int n = prices.length;
        int sp = prices[0];
        int maxProfit = 0;
        for(int i=1;i<n;i++){
            if(prices[i]<sp){
                sp = prices[i];
            }else if(prices[i]-sp>maxProfit){
                maxProfit = Math.max(maxProfit, prices[i]-sp);
            }
        }
        return maxProfit;
    }
}