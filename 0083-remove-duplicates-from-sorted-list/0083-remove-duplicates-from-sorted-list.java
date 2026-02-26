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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode root = head;
        ListNode root2 = head;
        ListNode nextNode = head.next;   
        while(root!=null && nextNode!=null){
            if(nextNode.val== root.val){
                root.next = nextNode.next;
            }else{
                root = root.next;
            }
            nextNode = nextNode.next;
        }
        return root2;
    }
}