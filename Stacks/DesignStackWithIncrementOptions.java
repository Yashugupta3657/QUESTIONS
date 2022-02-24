class CustomStack {
    int top=-1;
    int arr[];
    public CustomStack(int maxSize) {
        arr=new int[maxSize];
    }
    
    public void push(int x) {
        if(arr.length-1>top)
         arr[++top]=x;
    }
    
    public int pop() {
        if(top!=-1){
        int a=arr[top];
         arr[top]=0;
        top--;
        return a;
        }else return -1;
    }
    
    public void increment(int k, int val) {
         if(arr.length<k){
             for(int i=0;i<arr.length;i++){
                 arr[i]+=val;
             }
         }
        else{
            for(int i=0;i<k;i++){
                arr[i]+=val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
