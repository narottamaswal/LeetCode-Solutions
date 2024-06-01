class Solution {
public:
    int calPoints(vector<string>& operations) {
        int ans=0;
        stack<int> scoreStack;
        int first=0,second=0;
        for(auto it:operations){
            if(it=="+"){
                int top1 = scoreStack.top();
                scoreStack.pop();
                int top2 = scoreStack.top();
                scoreStack.pop();
                scoreStack.push(top2);
                scoreStack.push(top1);
                scoreStack.push(top1+top2);
            }else if(it=="C"){
                scoreStack.pop();
            }else if(it=="D"){
                int top = scoreStack.top();
                int newq= top*2;
                scoreStack.push(newq);
            }else{
                int no = stoi(it);
                scoreStack.push(no);
            }
        }
        while(!scoreStack.empty()){
            int a = scoreStack.top();
            scoreStack.pop();
            ans+=a;
        }
        return ans;
    }
};