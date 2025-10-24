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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode beginNode=null, endNode=null;
        int length=0;
        while(temp!=null){
            length++;
            if(length==k){
                beginNode=temp;
            }
            temp=temp.next;
        }
        int nel=length-k+1;
        length=0;
        temp=head;
        while(temp!=null){
            length++;
            if(length==nel){
                endNode=temp;
            }
            temp=temp.next;
        }
        int tempV=beginNode.val;
        beginNode.val=endNode.val;
        endNode.val=tempV;
        return head;
    }
}