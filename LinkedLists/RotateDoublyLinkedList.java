// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
	int data;
	Node next, prev;
	Node(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}

class MaximumFrequency{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int p = Integer.parseInt(str[1]);
			
			Node start = null;
			Node cur = null;
			Node ptr = null;
			str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++) {
				int a = Integer.parseInt(str[i]);
				ptr = new Node(a);
				if(start == null) {
					start = ptr;
					cur = ptr;
				}
				else {
					cur.next=ptr;
	                ptr.prev=cur;
	                cur=ptr;
				}
			}
			Solution obj = new Solution();
			Node node = obj.update(start, p);
			while(true)
	        {
				System.out.print(node.data+" ");
	            if(node.next == null)
	            	break;
	            node = node.next;
	        }
	        while(node != null)
	        {
	        	System.out.print(node.data+" ");
	            node = node.prev;
	        }
	        System.out.println();
		}
	}
}// } Driver Code Ends


//User function Template for Java

/*
class Node{
	int data;
	Node next, prev;
	Node(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}
*/

class Solution{
	public Node update(Node start, int p) {
		//Write your code here
		Node temp=start;
		Node t=start;
		while(temp.next!=null){
		    temp=temp.next;
		}
		while(p>0&&start!=null){
		    Node ti=start.next;
		    start.next=null;
		    ti.prev=null;
		    temp.next=start;
		    start.prev=temp;
		    temp=temp.next;
		    start=ti;
		    p--;
		}
		return start;
	}
}