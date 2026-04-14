class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    private void dfs(List<Integer> currList,int k,int target, int curr,int sum){
        if(k==currList.size()){
            if(sum==target){
                ans.add(new ArrayList<>(currList));
            }
            return;
        }
        for(int i=curr;i<10;i++){
            currList.add(i);
            dfs(currList,k,target,i+1,sum+i);
            currList.remove(currList.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(new ArrayList<>(),k,n,1,0);
        return ans;
    }
}