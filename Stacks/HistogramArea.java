class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long[] NSE=nse(hist,n);
        long[] PSE=pse(hist,n);
        long ans[]=new long[(int)n];
        long max=0;
        for(int i=0;i<n;i++){
            ans[i]=hist[i]*(NSE[i]-PSE[i]-1);
            if(ans[i]>=max){
                max=ans[i];
            }
        }
      
        return max;
    }
    public static long[] nse(long a[], long n){
        Stack<Integer> m=new Stack<>(); 
        long arr[]=new long[(int)n];
        m.push(0);
        for(int i=1;i<n;i++){
            while(!m.isEmpty()&&a[m.peek()]>a[i]){
                arr[m.pop()]=i;
            }
            m.push(i);
        }
        while(!m.isEmpty()){
            arr[m.pop()]=n;
        }
        
        return arr;
    }
    public static long[] pse(long a[], long n){
        Stack<Integer> m=new Stack<>(); 
          long arr[]=new long[(int)n];
          arr[0]=-1;
          m.push(0);
          for(int i=1;i<n;i++){
              while(!m.isEmpty()&&a[m.peek()]>=a[i]){
                  m.pop();
              }
              if(!m.isEmpty()){
                  arr[i]=m.peek();
              }
              else{
                  arr[i]=-1;
              }
              m.push(i);
          }
          return arr;
    } 
        
}
