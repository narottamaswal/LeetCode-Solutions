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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int c=-1;
        ListNode firstEnd=null;
        ListNode secondEnd=list2;
        ListNode newHead=list1;
        ListNode temp=list1;
        while(secondEnd.next!=null){
            secondEnd=secondEnd.next;
        }
        while(temp!=null){
            c++;
            if(c>=a){
                firstEnd.next=list2;
                while(c<=b  && temp!=null){
                    temp=temp.next;
                    c++;
                }
                secondEnd.next=temp;
                break;
            }
            firstEnd=temp;
            temp=temp.next;
        }
        return newHead;
    }
}