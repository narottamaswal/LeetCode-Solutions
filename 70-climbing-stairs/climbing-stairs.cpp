class Solution {
public:
    int climbStairs(int n) {
        vector<int> stairs_ways(n+1,0);
        stairs_ways[n]=1,stairs_ways[n-1]=1;
        for(int i=n-2;i>=0;i--){
            stairs_ways[i]=stairs_ways[i+1]+stairs_ways[i+2];
        }
        return stairs_ways[0];
    }
};