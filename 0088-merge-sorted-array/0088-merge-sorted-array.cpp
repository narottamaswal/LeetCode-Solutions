class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        map<int,int> mp1;
        for(int i=0;i<m;i++){
            mp1[nums1[i]]++;
        }
        for(auto it:nums2){
            mp1[it]++;
        }
        nums1.clear();
        for(auto it:mp1){
            while(it.second--){
                nums1.push_back(it.first);
            }
        }
    }
};