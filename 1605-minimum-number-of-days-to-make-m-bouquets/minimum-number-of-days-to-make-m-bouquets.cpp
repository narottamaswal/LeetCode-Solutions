class Solution {
public:
    bool canBloomAll(vector<int>& bloomDay, int m, int k,int mid){
        int bouquets = 0, flowersCollected = 0;
        for (int value : bloomDay) {
            flowersCollected = (value <= mid)?flowersCollected+1:0;
            if (flowersCollected == k) {
                bouquets++;
                flowersCollected = 0;
                if(bouquets==m)return true;
            }
        }
        return false;
    }
    int minDays(vector<int>& bloomDay, int m, int k) {
        long long int n = bloomDay.size();
        if(n == 0 || m == 0 || k == 0) return 0;
        const unsigned int M = 1000000007;
        long long int ans2 = ((m%M)*(k%M))%M;
        if (ans2 > n) return -1;
        auto it = minmax_element(bloomDay.begin(),bloomDay.end());
        int start=*it.first;
        int end=*it.second;

        int mid=0;
        int ans=INT_MAX;
        while(start<=end){
            mid = start+(end-start)/2;
            if(canBloomAll(bloomDay,m,k,mid)){
                ans=min(ans,mid);
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        if(ans==INT_MAX)return -1;
        return start;
    }
};