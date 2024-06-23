class Solution {
public:
    double minimumAverage(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n = nums.size();
        double ans =DBL_MAX;
        for(int i=0;i<n/2;i++){
            int start = nums[i];
            int end = nums[n-i-1];
            double av = (start+end)/2.0;
            ans=min(ans,av);
        }
        return ans;
    }
};

// 1 3 4 4 7 8 13 15

// 8 8 6 5.5


// 1 3 5 8 9 10
// 5.5 6 7.5