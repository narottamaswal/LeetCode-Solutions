class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        map<int,int> mp;
        int i=0,j=0,ans=0,n=fruits.size();
        if(n==1)return 1;
        while(j<n){
            mp[fruits[j]]++;
            if(mp.size()==2){
                ans=max(ans,j-i+1);
            }else if(mp.size()>2){
                while(mp.size()>2){
                    mp[fruits[i]]--;
                    if(mp[fruits[i]]==0){
                        mp.erase(fruits[i]);
                    }
                    i++;
                }
            }
            j++;
        }
        if(ans==0 && n>0){
            return n;
        }
        return ans;
    }
};