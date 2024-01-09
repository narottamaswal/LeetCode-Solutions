class Solution {
public:
    int minimumRounds(vector<int>& tasks) {
        unordered_map<int,int> mp;
        for(auto it:tasks){
            mp[it]++;
        }
        priority_queue<int,vector<int>,greater<int>> pq;
        for(auto it:mp){
            if(it.second==1){
                return -1;
            }
            pq.push(it.second);
        }
        int ans=0;
        while(!pq.empty()){
            auto it = pq.top();
            pq.pop();
            int task_count = it;
            while(task_count>0){
                int rem;
                if(task_count<3){
                     rem = task_count-2;
                }else{
                    if(task_count-2==2 && task_count-3==1){
                        rem=2;
                    }else{
                        rem = min(task_count-2,task_count-3);
                    }
                }
                if(rem==1){
                    return -1;
                }
                ans++;
                task_count=rem;
            }
        }
        return ans;
    }
};