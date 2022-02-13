class Solution
{
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> m=new Stack<Integer>();
    	for(int i=0;i<n;i++){
    	    m.push(i);
    	}
    	while(m.size()!=1){
    	    int banda1=m.pop();
    	    int banda2=m.pop();
    	    if(M[banda1][banda2]==1){
    	        m.push(banda2);
    	    }
    	    else{
    	        m.push(banda1);
    	    }
    	}
    	int celeb=m.pop();
    	for(int i=0;i<n;i++){
    	    if(M[celeb][i]==1){
    	        return -1;
    	    }
    	}
    	for(int i=0;i<n;i++){
    	    if(celeb!=i&&M[i][celeb]==0){
    	        return -1;
    	    }
    	}
    	    return celeb;
    }
}
