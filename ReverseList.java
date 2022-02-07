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
    public ListNode reverseList(ListNode head) {
         /* ListNode temp=head;
        ListNode m=null;
        Stack<Integer> st=new Stack<Integer>();
          while(temp!=null){
              st.push(temp.val);
              temp=temp.next;
          }
        ListNode t=null;
        while(!st.isEmpty()){
            if(m==null){
        
                ListNode g=new ListNode(st.pop());
                m=g;
                t=m;
            }
            else{
                ListNode g=new ListNode(st.pop());
                t.next=g;
                t=t.next;
            }
        }
        return m;*/
        ListNode tempy=null;
        while(head!=null){
            ListNode take=head.next;
            head.next=tempy;
            tempy=head;
            head=take;
        }
        return tempy;
    }
        
}
