class Solution {
public:
    bool condition(int mid,vector<int>& piles, int h){
        int ans=0;
        for(auto it:piles){
            ans = ans+(it/mid);
            if(it%mid!=0){
               ans++;
            }
            if(ans>h){
                return false;
            }
        }
        return true;

    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int start=1;
        int end = *max_element(piles.begin(),piles.end());
        int mid=0,ans=INT_MAX;
        while(start<=end){
            mid = start+(end-start)/2;
            if(condition(mid,piles,h)){
                ans=min(ans,mid);
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
};