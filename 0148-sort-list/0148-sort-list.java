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
        List<Integer> pq = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            pq.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(pq);
        ListNode newHead=null;
        temp=null;
        for(Integer a:pq){
            if(newHead==null){
                newHead = new ListNode(a);
                temp = newHead;
            }else{
                temp.next = new ListNode(a);
                temp = temp.next;
            }
        }
        return newHead;
    }
}