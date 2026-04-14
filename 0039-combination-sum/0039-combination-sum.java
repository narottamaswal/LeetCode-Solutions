class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    private void dfs(int index, int[] candidates, int target, int curSum, List<Integer> temp){
        if(target==curSum){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (curSum > target || index >= candidates.length) {
            return;
        }
        temp.add(candidates[index]);
        dfs(index,candidates,target,candidates[index]+curSum,temp);
        temp.remove(temp.size()-1);
        dfs(index+1,candidates,target,curSum,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        dfs(0,candidates,target,0,new ArrayList<>());
        return ans;
    }
}