class Solution {
public:
    int minimumRounds(vector<int>& tasks) {
        unordered_map<int,int> mp;
        int ans=0,rem=0;
        for(auto it:tasks){
            mp[it]++;
        }
        for(auto element:mp){
            int task_count =element.second;
            if(task_count==1) return -1;
            while(task_count>0){
                if(task_count<3){
                     rem = task_count-2;
                }else{
                    if(task_count-2==2 && task_count-3==1){
                        rem=2;
                    }else{
                        rem = min(task_count-2,task_count-3);
                    }
                }
                if(rem==1)return -1;
                ans++;
                task_count=rem;
            }
        }
        return ans;
    }
};