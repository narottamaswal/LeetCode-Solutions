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
    bool isPalindrome(ListNode* head) {
        string d;
        while (head != NULL) {
            d += head->val;
            head = head->next;
        }
        for(int i=0;i<d.length()/2;i++){
            if(d[i]!=d[d.length()-i-1]){
                return false;
            }
        }
        return true;
    }
};