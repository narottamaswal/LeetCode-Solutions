class Solution {
public:
    int findLeastNumOfUniqueInts(vector<int>& arr, int k) {
        priority_queue <int, vector<int>, greater<int>> pq; 
        unordered_map<int,int> mp;
        // create a map of element frequencies
        for(auto it:arr) mp[it]++;
        // insert the frequencies in min heap pq
        for(auto it:mp) pq.push(it.second);
        while(k>0){
            auto count = pq.top();
            pq.pop();
            // if current topmost element count is greater than or equal to k then we just have to remove this
            // element totally or partially depends on condition.
            // condition- 
            //      1. if its equal then rem will be 0 hence it can totally removed.
            //      2. if its greater than 0 that means the count of that element is greater 
            //      than k also so we can and insert the remaining count back to queue to get the correct result.
            if(count>=k){
                int rem = count-k;
                if(rem>0){
                    pq.push(rem);
                } 
                k=0;              
            }else{
                // if count is less than k then we can reduce the k count and move 
                k=k-count;
            }    
        }
        return pq.size();
        
    }
};