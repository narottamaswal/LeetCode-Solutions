class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> mp1 = new TreeMap<>();
        int n = nums.length, ans = 0;
        for(int a:nums){
            mp1.put(a,mp1.getOrDefault(a,0)+1);
        }
        int j=0;
        // for(int a:nums){
        //     if(a==1){
        //         nums[j++]=mp.getKey();
        //         ans++;
        //     }else if(a>=2){
        //         nums[j++]=mp.getKey();
        //         nums[j++]=mp.getKey();
        //         ans+=2;
        //     }
        // }
        for(Map.Entry<Integer,Integer> mp:mp1.entrySet()){
            if(mp.getValue()==1){
                nums[j++]=mp.getKey();
                ans++;
            }else if(mp.getValue()>=2){
                nums[j++]=mp.getKey();
                nums[j++]=mp.getKey();
                ans+=2;
            }
        }
        return ans;
    }
}