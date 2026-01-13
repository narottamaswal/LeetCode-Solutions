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
        ListNode temp = head;
        int l = 0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        return l;
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode temp2=null;
        int l = (length(temp)/2);
        while(l>0){
            temp2=temp;
            temp=temp.next;
            l--;
        }
        return temp;
    }
}