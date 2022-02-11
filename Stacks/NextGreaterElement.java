class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Integer> st=new Stack<Integer>();
        long nge[]=new long[n];
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
                nge[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nge[st.pop()]=-1;
        }
        return nge;
    } 
}
