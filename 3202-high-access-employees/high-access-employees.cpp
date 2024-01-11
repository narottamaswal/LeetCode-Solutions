class Solution {
public:
    vector<string> findHighAccessEmployees(vector<vector<string>>& access_times) {
        unordered_map<string,vector<int>> mp;
        for(auto it:access_times){
            int aa = stoi(it[1]);
            mp[it[0]].push_back(aa);
        }
        vector<string> ans;
        for(auto it:mp){
            string element = it.first;
            vector<int> &str = it.second;
            sort(str.begin(),str.end());
            int i=2;
            while(i<str.size()){
                if(str[i]- str[i-2]<100){
                    ans.push_back(element);
                    break;
                }
                i++;
            }
        }
        return ans;
    }
};
//a - 0549, 0532, 0621
//a - 0531 0549 0621