class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length, ans = 0, i= 0, sum=0, boats=0,j=n-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                boats++;
                i++;
                j--;
            }else if(people[i]+people[j]>limit){
                boats++;
                j--;
            }
        }
        return boats;
    }
}
// 1 2 2 3  3