class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n%groupSize!=0) return false;
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int a:hand){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        for(int key: mp.keySet()){
            if(mp.get(key)>0){
                int startingCount = mp.get(key);
                for(int i=1;i<groupSize;i++){
                    if(mp.getOrDefault(key+i,0)<startingCount){
                        return false;
                    }
                    mp.put(i+key,mp.get(i+key)-startingCount);
                }
            }
        }
        return true;

    }
}
// 1-1, 2-2, 3-2, 4-1, 6-1, 7-1