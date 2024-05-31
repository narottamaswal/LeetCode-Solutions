class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int ans = 0, start = 0, end=1,n=prices.size();
        while(end<n){
            if(prices[start]<prices[end]){
                ans = max(ans,prices[end]-prices[start]);
            }else{
                start=end;
            }
            end++;
        } 
        return ans;  
    }
};