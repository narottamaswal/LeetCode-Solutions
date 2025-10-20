class Solution {
public:
    bool help(int n){
        if(n<=0){
            return false;
        }else if(n<=1){
            return true;
        }
        if(n%2==1){
            return false;
        }
        return help(n/2);
    }
    bool isPowerOfTwo(int n) {
       return help(n);
    }
};