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
    ListNode* reverseList(ListNode* head) {
        ListNode* cur = head;
        ListNode* prev = NULL;

        while (cur != NULL) {
            ListNode* p = new ListNode(cur->val);
            cur = cur->next;
            p->next = prev;
            prev = p;
        }

        return prev;
    }
    bool isPalindrome(ListNode* head) {
        ListNode* reverse = reverseList(head);

        while (head && reverse) {
            if (reverse->val != head->val)
                return false;
            head = head->next;
            reverse = reverse->next;
        }
        return true;
    }
};