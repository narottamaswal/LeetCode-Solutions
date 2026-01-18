class Solution {
public:
    string smallestNumber(string pattern) {
        string ans="";
        int n = pattern.length();
        stack<int> st;
        pattern+=pattern[n-1];
        for(int i=1;i<=n+1;i++){
            if(pattern[i-1]=='I'){
                ans = ans+ char('0'+i);
                if(!st.empty()){
                    while(!st.empty()){
                        ans = ans+ char('0'+st.top());
                        st.pop();
                    }
                }
            }else{
                st.push(i);
            }
        }
        while(!st.empty()){
            ans = ans+ char('0'+st.top());
            st.pop();
        }
        return ans;
    }
};

// I I I D I D D D D
// 1 2 3 5 4 9 8 76   
// 6, 7 , 8 ,9
