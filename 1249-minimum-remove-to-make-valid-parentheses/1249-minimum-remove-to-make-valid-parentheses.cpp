class Solution {
public:
    string minRemoveToMakeValid(string s) {
        string ans="";
        stack<pair<char,int>> st;
        vector<char> d(s.begin(),s.end());
        int n = s.length(), i =0;
        while(i<n){
            if(s[i]=='('){
                st.push({s[i],i});
            }else if(s[i]==')'){
                if(!st.empty() && st.top().first=='('){
                    st.pop();
                }else{
                    st.push({s[i],i});
                }
            }
            i++;
        }
        while(!st.empty()){
            pair<char,int> d1 = st.top();
            st.pop();
            d[d1.second]='#';
        }
        for(char e:d){
            if(e!='#'){
                ans+=e;
            }
        }
        return ans;
    }
};
// ( ()))))
// ((((( ()))))