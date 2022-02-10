// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node temp=head;
        Node temp0=null;
        Node t0=null;
        Node temp1=null;
        Node t1=null;
        Node temp2=null;
        Node t2=null;
        while(temp!=null){
             if(temp.data==0){
                 if(temp0==null){
                     Node g=new Node(0);
                     temp0=g;
                     t0=g;
                 }
                 else{
                     Node g=new Node(0);
                     t0.next=g;
                     t0=t0.next;
                 }
             }
             else if(temp.data==1){
                  if(temp1==null){
                         Node g=new Node(1);
                     temp1=g;
                     t1=g;
                 }
                 else
                 {
                     Node g=new Node(1);
                        t1.next=g;
                     t1=t1.next;
                 }
             }
             else{
                   if(temp2==null){
                         Node g=new Node(2);
                     temp2=g;
                     t2=g;
                 }
                 else
                 {
                     Node g=new Node(2);
                        t2.next=g;
                     t2=t2.next;
                 }
             }
             temp=temp.next;
        }
        if(t1==null){
            t0.next=temp2;
        }
        else{
       t0.next=temp1;
       t1.next=temp2;
        }
        return temp0;
    }
}


