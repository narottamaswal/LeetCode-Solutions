class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
         int n = nums.length;
        if(n%k!=0) return false;
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int a:nums){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        for(int key: mp.keySet()){
            if(mp.get(key)>0){
                int startingCount = mp.get(key);
                for(int i=1;i<k;i++){
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