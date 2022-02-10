// { Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node prev=null;
     /*
        while(temp.next.next!=null&&temp!=null){
       while(head.data<head.next.data){
            head=head.next;
        }
            if(temp.next.data<temp.next.next.data)
            {
                temp.next=temp.next.next;
                temp=head;
            }
            else
            temp=temp.next;
            
        }
        return head;
        */
        while(head!=null){
            Node check=head.next;
            head.next=prev;
            prev=head;
            head=check;
        }
         head=prev;
         Node temp=prev;
          int max=0;
          while(temp!=null){
              if(max<=temp.data){
                  max=temp.data;
              }
              temp=temp.next;
          }
          temp=prev;
           while(temp.next!=null){
            
               if(temp.next.data<max){
                   temp.next=temp.next.next;
               }
               temp=temp.next;
           }
           Node ans=null;
        while(head!=null){
            Node check=head.next;
            head.next=ans;
            ans=head;
            head=check;
        }
        return ans;
        
    }
}
  
