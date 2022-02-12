class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    /////NextSmallerElement//
	    int arry[]=new int[n];
	    Stack<Integer> m=new Stack<Integer>();
	    m.push(0);
	    for(int i=1;i<n;i++){
	        while(!m.isEmpty()&&arr[m.peek()]>arr[i]){
	                arry[m.pop()]=arr[i];
	        }
	        m.push(i);
	    }
	    while(!m.isEmpty()){
	        arry[m.pop()]=-1;
	    }
	    return arry;
	} 
}
