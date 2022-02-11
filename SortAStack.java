//Using recursion
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		ts(s);
		 return s; 
	}
	public void ts(Stack<Integer> m){
	    if(!m.isEmpty()){
	        int temp=m.pop();
	        ts(m);
	        insert(m,temp);
	    }
	  
	}
	public void insert(Stack<Integer> m,int n){
	    if(m.isEmpty()||m.peek()<n)
	    {
	        m.push(n);
	    return ;
	        
	    }
	    int temp=m.pop();
	    insert(m,n);
	    m.push(temp);
	}
}
