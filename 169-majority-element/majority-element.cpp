class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int candidate,count=0;
        for(auto it:nums){
            if(count==0){
                count+=1;
                candidate=it;
            }else if(candidate==it){
                count++;
            }else{
                count--;
            }
        }
        int currentCount=0;
        for(auto it:nums){
            if(it==candidate){
                currentCount++;
            }
        }
        if(currentCount>count/2){
            return candidate;
        }
        return -1;
    }
};