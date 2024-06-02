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
    ListNode* deleteDuplicates(ListNode* head) {
        if(head==NULL){
            return head;
        }
        ListNode* root1 = head;
        ListNode* root = head;
        ListNode* nextNode = head->next;
        while(root!=NULL && nextNode!=NULL){
            if(nextNode->val==root->val){
                root->next = nextNode->next;
            }else{
                root=root->next;
            }
            nextNode=nextNode->next;
        }
        return root1;
    }
    };