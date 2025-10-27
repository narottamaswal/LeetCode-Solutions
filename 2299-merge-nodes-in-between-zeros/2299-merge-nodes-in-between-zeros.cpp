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
    ListNode* mergeNodes(ListNode* head) {
        ListNode* temp = head;
        ListNode* newHead=NULL;
        ListNode* tail=NULL;
        
        long long sum=0,z=0;
        while(temp!=NULL){
            if(temp->val==0){
                z++;
            }
            sum+=temp->val;
            if(z==2){
                ListNode* r = new ListNode(sum);
                if(newHead==NULL){
                    newHead = tail=r;
                }else{
                    tail->next=r;
                    tail=r;
                }
                sum=0;
                z--;
            }
            temp=temp->next;
        }
        return newHead;
    }
};