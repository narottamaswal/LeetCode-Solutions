class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    private void dfs(List<Integer> currList,int k,int target, int index,int currSum){
        if(k==currList.size()){
            if(currSum==target){
                ans.add(new ArrayList<>(currList));
            }
            return;
        }
        for(int i=index;i<=9;i++){
            currList.add(i);
            if(currSum+i<=target){
                dfs(currList,k,target,i+1,currSum+i);
            }
            currList.remove(currList.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(new ArrayList<>(),k,n,1,0);
        return ans;
    }
}