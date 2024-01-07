#define mypair pair<int,int>
class Solution {
public:
    int findLeastNumOfUniqueInts(vector<int>& arr, int k) {
        priority_queue <mypair, vector<mypair>, greater<mypair>> pq; 
        unordered_map<int,int> mp;
        for(auto it:arr){
            mp[it]++;
        }
        for(auto it:mp){
            pq.push({it.second,it.first});
        }
        bool flag=true;
        while(!pq.empty() && k>0){
            auto top = pq.top();
            int count = top.first;
            int element = top.second;
            pq.pop();
            if(count>=k){
                int rem = count-k;
                if(rem>0){
                    pq.push({rem,element});
                } 
                k=0;              
            }else{
                k=k-count;
            }    
        }
        return pq.size();
        
    }
};