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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        while(k>0){
            ListNode start=head;
            ListNode n=head;
            while(n.next.next!=null){
                n=n.next;
            }
            ListNode end=n.next;
            n.next=null;
            end.next=start;
            head=end;
            k--;
        }
        return head;
    }
}
