class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        priority_queue<int> pq;
        vector<int>ans(arr.size(),-1);
        for(int i=arr.size()-1;i>=0;i--){
            if(pq.empty()){
                ans[i]=-1;
            }else{
               ans[i]=pq.top();
            }
            pq.push(arr[i]);
        }
        return ans;
    }
};