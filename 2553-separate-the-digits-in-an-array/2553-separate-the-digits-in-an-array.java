class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int a=nums[i];
            while(a>0){
                ll.add(a%10);
                a=a/10;
            }
        }
        Collections.reverse(ll);
        return ll.stream()
                           .mapToInt(Integer::intValue)
                           .toArray();
    }
}