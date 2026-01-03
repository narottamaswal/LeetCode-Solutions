class Solution {
public:
    int numRescueBoats(vector<int>& people, int limit) {
        int sum=0;
        sort(people.begin(),people.end());
        int s=0;
        int c=0;
        int e=people.size()-1;
        while(s<=e){
            if(people[s]+people[e]<=limit){
                c++;
                s++;
                e--;
            }else if(people[s]+people[e]>limit){
                c++;
                e--;
            }
        }  
        return c; 
    }
};