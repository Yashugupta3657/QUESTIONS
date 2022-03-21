class Solution {
    public void reverseString(char[] s) {
        char b[]=new char[s.length];
         for(int i=s.length-1,j=0;i>=0;i--){
             b[j++]=s[i];
         }
        for(int i=0;i<s.length;i++){
            s[i]=b[i];
        }
    }
}
