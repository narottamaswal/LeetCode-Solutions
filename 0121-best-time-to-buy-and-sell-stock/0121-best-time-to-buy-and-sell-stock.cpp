class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int ans=0,start=0,end=1;
        while(end<prices.size()){
            if(prices[start]>=prices[end]){
                start=end;
            }else if(prices[start]<prices[end]){
                ans=max(ans,prices[end]-prices[start]);
            }
            end++;
        }
        return ans;
    }
};