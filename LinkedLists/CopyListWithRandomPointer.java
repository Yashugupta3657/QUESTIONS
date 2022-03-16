/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> tra=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node temp1=new Node(temp.val);
            tra.put(temp,temp1);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node g=tra.get(temp);
            g.next=tra.get(temp.next);
            g.random=tra.get(temp.random);
            temp=temp.next;
        }
        return tra.get(head);
    }
}
