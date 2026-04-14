class Solution {
    
    List<String> ans = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    private void dfs(String s,int i,String ele){
        if(ele.length()==s.length() || i==s.length()){
            ans.add(ele);
            return;
        }
        if(Character.isDigit(s.charAt(i))){
            dfs(s,i+1,ele+s.charAt(i));
            return;
        }
        dfs(s,i+1,ele+s.charAt(i));
        char b = Character.isUpperCase(s.charAt(i)) ? Character.toLowerCase(s.charAt(i)): Character.toUpperCase(s.charAt(i));
        dfs(s,i+1,ele+b);
    }

    public List<String> letterCasePermutation(String s) {
        dfs(s,0,"");
        return ans;
    }
}