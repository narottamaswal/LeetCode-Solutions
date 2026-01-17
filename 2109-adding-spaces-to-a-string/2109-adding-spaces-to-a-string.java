class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i=0, j=0, n = s.length(), m = spaces.length;
        while(i<n || j<m){
            if(i<n && j<m && spaces[j]==i){
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}