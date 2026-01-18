class Solution {
public:
    bool canBeValid(string s, string locked) {
        int n = s.length();
        if(n%2==1){
            return false;
        }
        stack<int> lockStack, st;
        for(int i=0;i<n;i++){
            if(locked[i]=='0'){
                lockStack.push(i);
            }else if(s[i]=='('){
                st.push(i);
            }else{
                if(!st.empty()){
                    st.pop();
                }else if(!lockStack.empty()){
                    lockStack.pop();
                }else{
                    return false;
                } 
            }
        }
        while(!st.empty() && !lockStack.empty() && st.top()<lockStack.top()){
            st.pop();
            lockStack.pop();
        }
        return st.empty();
    }
};
// 