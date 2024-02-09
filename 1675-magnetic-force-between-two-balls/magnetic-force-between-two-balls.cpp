class Solution {
public:
    bool isValidDistance(vector<int>& position,long long int mid, long long int m,long long int n){
       long long int current=1, last = position[0];
        for(long long int i=1;i<n;i++){
            if(position[i]-last>=mid){
                current++;
                last = position[i];
            }
            if(current>=m){
                return true;
            }
        }
        return false;
    }
    int maxDistance(vector<int>& position, int m) {
        sort(position.begin(),position.end());

        long long int n = position.size(),start=0,end=0,mid=0;
        for(auto it:position){
            end+=it;
        }
        long long ans=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(isValidDistance(position,mid,m,n)){
                start=mid+1;
                ans=mid;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
};


//22 57 74 79
