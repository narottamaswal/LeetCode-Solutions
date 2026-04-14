class Solution {
    public void fun2(List<Integer> fun,List<List<Integer>> ans,int c){
        if(c==fun.size()){
            ans.add(new ArrayList<>(fun));
            return;
        }
        for(int i=c;i<fun.size();i++){
            swap(fun,i,c);
            fun2(fun,ans,c+1);
            swap(fun,i,c);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> fun = Arrays.stream(nums).boxed().collect(Collectors.toList());
        fun2(fun,ans,0);
        return ans;
    }
    private void swap(List<Integer> nums,int a,int b){
        int temp = nums.get(a);
        nums.set(a,nums.get(b));
        nums.set(b,temp);
    }
}