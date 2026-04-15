class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDist = Integer.MAX_VALUE;        
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {  
                int res = Math.min(Math.abs(startIndex - i), n - Math.abs(startIndex - i));
                minDist = Math.min(minDist, res);
           }
        }        
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}