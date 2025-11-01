/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        if(head==NULL) return false;
        ListNode* first = head;
        ListNode* second = head->next;
        while(first && second){
            if(first->val!=second->val){
                return true;
            }
            first=second;
            second=second->next;
        }
        return false;
    }
};