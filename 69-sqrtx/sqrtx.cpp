class Solution {
public:
    int mySqrt(int x) {
        if(x<=1)return x;
        auto condition=[&](long long int a,long long int x1){
            if(a*a==x1){
                return 1;
            }else if(a*a<x1){
                return 2;
            }else{
                return 0;
            }
        };
        long long int low=1, high= x,mid=0, ans=0;
        while(low<=high){
            mid = high-(high-low)/2;
            long long int temp = condition(mid,x);
            if(temp==1){
                return mid;
            }else if(temp==2){
                ans=mid;
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
};