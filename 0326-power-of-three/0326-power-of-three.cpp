class Solution {
public:
    bool help(int n){
        if(n==1){
            return true;
        }
        return n%3==0 && help(n/3);
    }
    bool isPowerOfThree(int n) {
        if(n==1){
            return true;
        }else if(n<=0 || n<3){
            return false;
        }
        return help(n);
    }
};
// 3 6 8 9 63 21
// 3 * 3 * 3
// 27