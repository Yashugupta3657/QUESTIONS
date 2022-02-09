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
		   
		      head = new Solution().mergeSort(head);
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
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
  
    /*
    static Node merge(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node temp1=calcmid(head);
        Node headnxt=temp1.next;
        temp1.next=null;
        Node left=merge(head);
        Node right=merge(headnxt);
        
        Node ans=MergeSort(left,right);
        return ans;
    }
    static Node calcmid(Node head){
        if(head==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    static Node MergeSort(Node temp1,Node temp2){
           Node ff=null;
           if(temp1==null){
               return temp2;
           }
           if(temp2==null){
               return temp1;
           }
           if(temp1.data<=temp2.data){
               ff=temp1;
               ff.next=MergeSort(temp1.next,temp2);
           }
           else{
               ff=temp2;
               ff.next=MergeSort(temp1,temp2.next);
           }
           return ff;
    }*/
      static Node mergeSort(Node head)
    {

        head=merge(head);
        return head;
    }
    
    static Node merge(Node head){
        if(head.next==null){
            return head;
        }
       Node middle= midd(head);
       Node middlenxt=middle.next;
       middle.next=null;
       
       Node temp1=merge(head);
       Node temp2=merge(middlenxt);
       Node ans=mergeiy(temp1,temp2);
       return ans;
    }
    static Node mergeiy(Node temp1,Node temp2){
        Node anss=null;
        if(temp1==null) return temp2;
        if(temp2==null) return temp1;
        if(temp1.data>=temp2.data){
            anss=temp2;
            anss.next=mergeiy(temp1,temp2.next);
        }
        else{
            anss=temp1;
            anss.next=mergeiy(temp1.next,temp2);
        }
        return anss;
    }
    static Node midd(Node head){
        if(head==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}


