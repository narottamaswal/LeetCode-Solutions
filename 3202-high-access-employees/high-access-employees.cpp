class Solution {
public:
    vector<string> findHighAccessEmployees(vector<vector<string>>& access_times) {
        unordered_map<string,vector<string>> mp;
        for(auto it:access_times){
            string element = it[0];
            string aa = it[1];
            mp[element].push_back(aa);
        }
        vector<string> ans;
        for(auto it:mp){
            string element = it.first;
            vector<string> str = it.second;
            sort(str.begin(),str.end());
            int i=2;
            while(i<str.size()){
                string aa = str[i];
                string ab = str[i-2];
                if(stoi(aa)-stoi(ab)<100){
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