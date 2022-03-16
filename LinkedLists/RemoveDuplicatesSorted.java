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
        ListNode n=head;
        if(head==null)
        {
            return head;
        }
        while(n!=null&&n.next!=null){
            ListNode start=n;
            if(n.val==n.next.val){
                  while(n.next!=null&&n.val==n.next.val){
                   n=n.next;
               }
                head=n.next;
                n=head;
            }
            else if(n.next.next!=null&&n.next.val==n.next.next.val){
               while(n.next.next!=null&&n.next.val==n.next.next.val){
                   n=n.next;
               } 
                start.next=n.next.next;
                n=start;
            }
            else
            n=n.next;
        }
        return head;
    }
}
