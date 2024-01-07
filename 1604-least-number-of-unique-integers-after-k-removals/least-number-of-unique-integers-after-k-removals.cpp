class Solution {
public:
    int findLeastNumOfUniqueInts(vector<int>& arr, int k) {
        priority_queue <int, vector<int>, greater<int>> pq; 
        unordered_map<int,int> mp;
        for(auto it:arr){
            mp[it]++;
        }
        for(auto it:mp){
            pq.push(it.second);
        }
        bool flag=true;
        while(k>0){
            auto count = pq.top();
            pq.pop();
            if(count>=k){
                int rem = count-k;
                if(rem>0){
                    pq.push(rem);
                } 
                k=0;              
            }else{
                k=k-count;
            }    
        }
        return pq.size();
        
    }
};