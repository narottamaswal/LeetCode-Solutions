class Solution {
    public boolean judgeCircle(String moves) {
        int[] sc = new int[]{0,0};
        for(int i=0;i<moves.length();i++){
            char cc = moves.charAt(i);
            if(cc=='U'){
                sc[1]++;
            }else if(cc=='D'){
                sc[1]--;
            }else if(cc=='L'){
                sc[0]--;
            }else if(cc=='R'){
                sc[0]++;
            }
        }
        return sc[0]==0 && sc[1]==0;
    }
}