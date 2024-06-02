class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size()==0) return 0;
        priority_queue<int,vector<int>,greater<int>> pq;
        for(auto it:nums) pq.push(it);
        int ans=0, finalAns=0;
        int first = pq.top();
        pq.pop();
        while(!pq.empty()){
            int second = pq.top();
            pq.pop();
            if(first==second){
                continue;
            }else if(second-first==1){
                ans++;
            }else{
                ans=0;
            }
            finalAns = max(finalAns,ans);
            first=second;
        }
        return finalAns+1;
    }
};
// 1 2 3 4 100 200
// 1 and 2