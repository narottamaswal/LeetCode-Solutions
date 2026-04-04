class Solution {
    private int minutes(String current){
        int ans=0;
        String[] parts = current.split(":");
        ans = ans + 60 * Integer.parseInt(parts[0]);
        ans = ans + Integer.parseInt(parts[1]);
        return ans;
    }
    public int convertTime(String current, String correct) {
        int minutes1 = minutes(current); // 150
        int minutes2 = minutes(correct); // 275    (125)
        int diff = Math.min(Math.abs(minutes1-minutes2),Math.abs(minutes2-minutes1));
        int ans =0;
        while(diff>0){
            if(diff>=60){
                diff-=60;
            }else if(diff>=15){
                diff-=15;
            }else if(diff>=5){
                diff-=5;
            }else if(diff>=1){
                diff-=1;
            }
            ans++;
        }
        return ans;
    }
}