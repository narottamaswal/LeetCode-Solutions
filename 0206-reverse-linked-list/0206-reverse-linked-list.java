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
    public ListNode reverseList(ListNode head) {
        ListNode first=null;
        ListNode second=head;
        if(head==null){
            return head;
        }
        ListNode third = head.next;
        while(second!=null && third!=null){
            ListNode temp = third.next;
            third.next = second;
            second.next=first;
            first=second;
            second=third;
            third=temp;
        }
        return second;       
    }
}
// temp=null
// null 1 2 3
// 1
