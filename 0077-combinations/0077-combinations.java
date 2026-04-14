class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    private void dfs(List<Integer> dp,int c,int k,int n){
        if(dp.size()==k){
            ans.add(new ArrayList<>(dp));
            return;
        }
        for(int i=c;i<=n;i++){
            dp.add(i);
            dfs(dp,i+1,k,n);
            dp.remove(dp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> nums = IntStream.range(1,n+1).boxed().collect(Collectors.toList());
        dfs(new ArrayList<>(),1,k,n);
        System.out.println(ans);
        return ans;
        
    }
}