class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] first = intervals[0];
        int n=intervals.length, i=1;
        List<int[]> ll = new ArrayList<>();
        while(i<n){
            int[] second = intervals[i++];
            if(first[1]>=second[0]){
                first[1]=Math.max(first[1],second[1]);
            }else{
                ll.add(first);
                first=second;
            }
        }
        ll.add(first);
        return ll.toArray(new int[ll.size()][]);
    }
}
// 1 4
// 2 6

// 1 6 
// 2 4