class Solution {
    Set<List<Integer>> ans = new HashSet<>();

    private void dfs(int index, int fixedIndex, int[] nums,List<Integer> arr){
        if(arr.size()>1){
            ans.add(new ArrayList<>(arr));
        }
        for(int i=index;i<nums.length;i++){
            if(arr.size()>0 && nums[i]<arr.get(arr.size()-1)){
                continue;
            }
            arr.add(nums[i]);    
            dfs(i+1,fixedIndex,nums,arr);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0,0,nums,new ArrayList<>());
        List<List<Integer>> list = ans.stream()
                       .collect(Collectors.toList());
        return list;
    }
}