class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        priority_queue<int> pq;
        for(auto it:stones){
            pq.push(it);
        }
        while(pq.size()>=2){
            int top1 = pq.top();
            pq.pop();
            int top2 = pq.top();
            pq.pop();
            if(top1!=top2){
                pq.push(top1-top2);
            }
        }
        return pq.size()==1?pq.top():0;
    }
};