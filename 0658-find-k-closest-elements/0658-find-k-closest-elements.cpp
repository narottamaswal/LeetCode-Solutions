
class Solution {
public:
// struct myComp {
//     constexpr bool operator()(
//         pair<int, int> const& a,
//         pair<int, int> const& b)
//         const noexcept
//     {
//         return a.second < b.second;
//     }
// };

    vector<int> findClosestElements(vector<int>& arr, int k, int x) {

            //priority_queue<pair<int, int>, vector<pair<int, int>>, myComp> pq;
 priority_queue<pair<int, int>> pq;
        vector<int> ans(k,0);
        int diff=0;
        for(auto it:arr){
            diff=abs(it-x);
            pq.push({diff,it});
            if(pq.size()>k){
                pq.pop();
            }
        }
        int i=k-1;
        while(!pq.empty()){
            ans[i]=pq.top().second;
            pq.pop();
            i--;
        }
        sort(ans.begin(),ans.end());
        return ans;
    }
};