/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        stack<int> s1,s2,s3;
        ListNode* temp=l1;
        while(temp!=NULL){
            s1.push(temp->val);
            temp=temp->next;
        }
        temp=l2;
        while(temp!=NULL){
            s2.push(temp->val);
            temp=temp->next;
        }
        ListNode* h1=NULL;
        int carry=0,g=0,sum=0;
        while(!s1.empty() || !s2.empty()){
            sum=carry;
            if(!s1.empty()){
                sum+=s1.top();
                s1.pop();
            }
            if(!s2.empty()){
                sum+=s2.top();
                s2.pop();
            }
            g=sum;
            carry=0;
            if(sum>9){
                g=sum-10;
                carry=sum/10;
            }
            s3.push(g);
            cout<<g<<endl;
            g=0;
        }
        if(carry>0){
            s3.push(carry);
        }
        ListNode* head = NULL;
        ListNode* tail=NULL;
        while(!s3.empty()){
            ListNode* newHead2 = new ListNode(s3.top());
            if(head==NULL){
                head=newHead2;
                tail=newHead2;
            }else{
                tail->next=newHead2;
                tail=newHead2;
            }
            s3.pop();
        }
        return head;
    }
};