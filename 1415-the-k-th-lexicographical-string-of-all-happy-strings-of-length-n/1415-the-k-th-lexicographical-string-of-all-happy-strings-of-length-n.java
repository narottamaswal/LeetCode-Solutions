class Solution {
    char[] arr={'a','b','c'};
    List<String> ans = new ArrayList<>();

    private void dfs(int n, int id, char ch, StringBuilder curr){
        if(id==n){
            ans.add(curr.toString());
            return;
        }
        for(char a:arr){
            if(a!=ch){
                curr.append(a);
                dfs(n,id+1,a,curr);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }
    public String getHappyString(int n, int k) {
        dfs(n,0,'0',new StringBuilder());
        Collections.sort(ans);
        if(ans.size()<k)return "";
        return ans.get(k-1); 

    }
}