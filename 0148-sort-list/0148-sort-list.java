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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode temp = head;
        while(temp!=null){
            pq.add(temp.val);
            temp = temp.next;
        }
        ListNode newHead=null;
        temp=null;
        while(!pq.isEmpty()){
            if(newHead==null){
                newHead = new ListNode(pq.poll());
                temp = newHead;
            }else{
                temp.next = new ListNode(pq.poll());
                temp = temp.next;
            }
        }
        return newHead;
    }
}