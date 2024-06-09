class Solution {
public:
    int numberOfChild(int n, int k) {
        int start=0;
        int ans=0;
        bool reachedEnd=false;
        while(k>0){
            if(start==0){
                reachedEnd=false;
            }else if(start==n-1){
                reachedEnd=true;
            }
            if(reachedEnd){
                start--;
            }
            else{
                start++;
            }
            k--;
        }
        return start;
    }
};