class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   s1.push(x);
    }
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans=0;
        if(!s2.isEmpty())
         ans=s2.pop();
        else  ans=-1;
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
	   // Your code here
    }
}
