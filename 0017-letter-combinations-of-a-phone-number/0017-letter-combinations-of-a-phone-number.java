class Solution {
    private List<String> ans = new ArrayList<>();
    
    Map<Character,List<Character>> mp = new HashMap<>();
    
    private void buildMap(String digits){
        for(int i=2;i<=9;i++){
            mp.put((char)(i+'0'),new ArrayList<>());
        }
        char a ='a';
        for(int i=2;i<=9;i++){
            for(int j=0;j<3;j++){
                mp.get((char)(i+'0')).add(a++);
            }
            if(i==7){
                mp.get('7').add(a++);
            }
        } 
        mp.get('9').add('z');

    }
    
    private void dfs(String digits,int index,StringBuilder curr){
        if(index==digits.length() || curr.length()==digits.length()){
            ans.add(curr.toString());
            return;
        }
        List<Character> ele = mp.get(digits.charAt(index));
        for(char a: ele){
            curr.append(a);
            dfs(digits,index+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        buildMap(digits);
        System.out.println(mp.entrySet());
        dfs(digits,0,new StringBuilder());
        return ans;
    }
}