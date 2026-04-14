class Solution {
    Set<Integer> ele = new HashSet<>();

    private void dfs(int n,int k,StringBuilder sb,char a){
        if(sb.length()==n){
            if(sb.charAt(0)!='0'){
                ele.add(Integer.parseInt(sb.toString()));
            }
            return;
        }
        for(char i='0';i<='9';i++){
            if(Math.abs(a-i)==k){
                sb.append(i);
                dfs(n,k,sb,i);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        for(char i='0';i<='9';i++){
            dfs(n,k,new StringBuilder(),i);
        }
        return ele.stream().mapToInt(i -> i).toArray();
    }
}
// n= 5
// k = 4
// 0000 to 9999