class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        vector<int> ans;
        priority_queue<pair<int,int>> maxPq;
        int n = nums.size();
        int i=0,j=0;
        while(j<n){
            maxPq.push({nums[j],j});
            if(j-i+1==k){
                while(i>maxPq.top().second){
                    maxPq.pop();
                }
                ans.push_back(maxPq.top().first);
                i++;
            }
            j++;
        }
        return ans;
    }
};