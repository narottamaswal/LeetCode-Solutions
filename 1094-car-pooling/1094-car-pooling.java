class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] locations = new int[1001];
        int d = 0;
        for(int i=0;i<trips.length;i++){
            int n = trips[i][0];
            int f = trips[i][1];
            int t = trips[i][2];
            locations[f]+=n;
            locations[t]-=n;
        }
        for(int i:locations){
            d+=i;
            if(d>capacity){
                return false;
            }
        }
        return true;
    }
}