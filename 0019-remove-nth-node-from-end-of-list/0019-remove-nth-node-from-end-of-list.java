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
    private int length(ListNode head){
        int l = 0;
        ListNode fast  = head;
        while(fast!=null && fast.next!=null){
            l++;
            fast = fast.next.next;
        }
        l = fast==null ? 2*l : (2*l)+1;
        System.out.println(l);
        return l;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = length(head);
        System.out.println(count);
        if(count==n){
            return head.next;
        }
        count = count-n;
        ListNode prevNode = head;
        for(int i = 1; i < count; i++){
            prevNode = prevNode.next;
        }

        prevNode.next = prevNode.next.next;

        return head;
    }
}