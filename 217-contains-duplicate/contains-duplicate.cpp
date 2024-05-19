class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int,int> frequency_map;
        for(auto num: nums){
            if(frequency_map[num]>0){
                return true;
            }
            frequency_map[num]++;
        }
        return false;
    }
};