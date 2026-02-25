/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode res = new ListNode();
        ListNode res2 = res;
        int sum=0,carry=0;
        while(t1!=null || t2!=null || carry>0){
            sum=0;
            if(t1!=null){
                sum+=t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            }
            sum = sum+carry;
            carry = sum/10;
            ListNode tmp = new ListNode(sum%10);
            res.next = tmp;
            res = res.next;
        }
        return res2.next;
    }
}