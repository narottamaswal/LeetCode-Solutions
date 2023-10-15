class Solution {
public:
    vector<string> printVertically(string s) {
        vector<string> data;
        string t="";
        int ans=INT_MIN;
        for(int i=0;i<s.length();i++){
            if(s[i]!=' '){
                t+=s[i];
            }else{
                
                data.push_back(t);
                int l=t.length();
                ans=max(ans,l);
                t.clear();
            }
        }
        data.push_back(t);
        int l=t.length();
        ans=max(ans,l);
        t.clear();
        vector<string> ans2;
        for(int i=0;i<ans;i++){
            string temp="";
            for(int j=0;j<data.size();j++){
                string vv = data[j];
                if(vv.length()>i){
                    temp+=data[j][i];
                }else if(vv.length()<=i){
                    temp+=' ';
                }

            }
            while(temp.back()==' '){
                temp.pop_back();
            }
            ans2.push_back(temp);
            temp.clear();
        }
        return ans2;
    }
};