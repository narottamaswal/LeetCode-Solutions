/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int getLength(ListNode head){
        int l=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        return l;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = getLength(headA),l2 =getLength(headB);
        int k = Math.abs(l1-l2);
        ListNode temp1 = headA, temp2=headB;
        if(l1>l2){
            while(k>0){
                temp1=temp1.next;
                k--;
            }
        }else{
            while(k>0){
                temp2=temp2.next;
                k--;
            }
        }
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}