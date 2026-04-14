class Solution {
    int ans=0;
     public void fun2(List<Integer> fun,int c){
        if(c==fun.size()){
            ans++;
            return;
        }
        for(int i=c;i<fun.size();i++){
            if(fun.get(i)%(c+1)==0 || (c+1)%fun.get(i)==0){
                swap(fun,i,c);
                fun2(fun,c+1);
                swap(fun,i,c);
            }
        }
    }
    
    public int countArrangement(int n) {
        // List<List<Integer>> ans = new ArrayList<>();
        List<Integer> fun = IntStream.range(1, n + 1)
                             .boxed()
                             .collect(Collectors.toList());
        fun2(fun,0);
        return ans;
        // return ans.size();
    }
    private void swap(List<Integer> nums,int a,int b){
        int temp = nums.get(a);
        nums.set(a,nums.get(b));
        nums.set(b,temp);
    }
}