class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String d = new String(chars);
            if(!mp.containsKey(d)){
                mp.put(d,new ArrayList<>());
            }
            mp.get(d).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}