class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> m=new Stack<Integer>();
        int j=0;
           for(int i=0;i<pushed.length;i++){
               m.push(pushed[i]);          ///push each element until we find the top which is poped 
               while(j<popped.length&&!m.isEmpty()&&popped[j]==m.peek()){
                   m.pop();
                   j++;
               }
           }
        if(m.isEmpty())return true;
        return false;
    }
}
