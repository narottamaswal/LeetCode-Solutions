class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length, teams=n/2;
        long sum=0;
        if(n%2!=0){
            return -1;
        }else if(n==2){
            return skill[0]*skill[1];
        }
        Map<Integer,Integer> mp = new HashMap<>();
        for(int a:skill){
            mp.put(a,mp.getOrDefault(a,0)+1);
            sum+=a;
        }
        if(sum%teams!=0) return -1; 
        int eachTeamSkill = Math.toIntExact(sum/teams) ;
        sum=0;
        for(int i=0;i<n;i++){
            int c = skill[i], rem = Math.abs(eachTeamSkill-c);
            if(mp.containsKey(rem)){
                mp.put(c,mp.getOrDefault(c,0)-1);
                mp.put(rem,mp.getOrDefault(rem,0)-1);
                sum = sum+(c*rem);
                if(mp.getOrDefault(c,0)<=0){
                    mp.remove(c);
                }
                if(mp.getOrDefault(rem,0)<=0){
                    mp.remove(rem);                    
                }
            }
        }
        return mp.size()>0 ? -1 : sum;
    }
}


// 2 4 3 3 1 5
// 8 9 5
// 5 