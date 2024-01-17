class Solution {
public:
    bool isPowerOfFour(int n) {
        if(n==1)return true;
        return 1==__builtin_popcount(n) &&  __builtin_ffs(n)%2!=0;
    }
};