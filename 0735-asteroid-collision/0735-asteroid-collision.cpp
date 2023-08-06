class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        int n=asteroids.size();
        
        stack<int> st;

        for(int i=0;i<n;i++){
            if(st.empty() || asteroids[i]>0) st.push(asteroids[i]);
            else{
                while(abs(asteroids[i])>st.top() && st.top()>0){
                    st.pop();
                    if(st.empty()) break;
                }
                if(st.empty()) st.push(asteroids[i]);
                else if(st.top()==abs(asteroids[i])){
                    st.pop();
                    continue;
                }else if(st.top()<0) st.push(asteroids[i]);
                
            }
        }

        vector<int> v(st.size());
        for(int i=st.size()-1;i>=0;i--){
            v[i]=st.top();
            st.pop();
        }

        return v;

    }
};