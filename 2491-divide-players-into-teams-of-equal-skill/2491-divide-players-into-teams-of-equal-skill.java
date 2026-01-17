class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length, teams=n/2;
        long sum=0;
        if(n==2) return skill[0]*skill[1];
        int[] skillFreq = new int[1001];
        for(int a:skill){
            skillFreq[a]++;
            sum+=a;
        }
        if(sum%teams!=0) return -1; 
        int eachTeamSkill = (int)(sum/teams) ;
        sum=0;
        for(int c:skill){
            if(skillFreq[c]==0){
                continue;
            }
            int rem = Math.abs(eachTeamSkill-c);
            if (rem < 0 || rem > 1000 || skillFreq[rem] == 0) {
                return -1;
            }
            if(skillFreq[rem]>0){
                skillFreq[c]--;
                skillFreq[rem]--;
                sum = sum+(c*rem);
            }
        }
        return sum;
    }
}


// 2 4 3 3 1 5
// 8 9 5
// 5 