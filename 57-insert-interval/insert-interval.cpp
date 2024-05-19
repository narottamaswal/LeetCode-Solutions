class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        intervals.push_back(newInterval);
        int n = intervals.size();
        vector<vector<int>> ans;
        sort(intervals.begin(),intervals.end());
        vector<int> firstInterval = intervals[0];
        ans.push_back(firstInterval);
        for(int i=1;i<intervals.size();i++){
            vector<int> secondInterval=intervals[i];
            if(firstInterval[1]>=secondInterval[0]){
                firstInterval[1]=max(firstInterval[1],secondInterval[1]);
                ans.back()[1]=firstInterval[1];
            }else{
                ans.push_back(secondInterval);
                firstInterval=secondInterval;
            }
        }
        return ans;
    }
};