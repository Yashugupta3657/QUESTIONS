class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        Stack<Integer> m=new Stack<Integer>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(0,-1);
        m.push(0);
        for(int i=1;i<n;i++){
            while(!m.isEmpty()&&a[m.peek()]>=a[i]){
               m.pop();
            }
            if(!m.isEmpty()&&a[m.peek()]<a[i])
            arr.add(i,a[m.peek()]);
            else
            arr.add(i,-1);
            
            m.push(i);
        }
        return arr;
    }
}
