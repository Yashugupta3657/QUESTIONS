class Solution{
    static String longestPalin(String S){
        int start=0,end=0,flag=0;
        for(int i=0;i<S.length();i++){
            int len1=expandcenter(S,i,i+1);
            int len2=expandcenter(S,i,i);
            int len=Math.max(len1,len2);
            if(end-start+1<len){
                start=i-(len-1)/2;
                  end=i+len/2;
                  flag=1;
                
            }
        }
    
        return S.substring(start,end+1);
    }
    static int expandcenter(String str,int a,int b){
        while(a>=0&&b<str.length()&&str.charAt(a)==str.charAt(b)){
            a--;
            b++;
        }
        return b-a-1;
    }
    /*
    static ArrayList<String> list=new ArrayList<String>();
    static String longestPalin(String S){
        // code here
        
           int max=0;
        String finnal="";
        String str=S;
        
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String s=str.substring(i,j);
                if(isPalindrome(s)==1){
                    if(max<s.length()){
                        max=s.length();
                        finnal=s;
                    }
                }
            }
        }
        return finnal;
        
        list.clear();
        findsubsequences(S);
        int n=0;
        String str="";
        for(int i=0;i<list.size();i++){
   
            if(isPalindrome(list.get(i))==1){
                if(n<list.get(i).length()){
                    n=list.get(i).length();
                    str=list.get(i);
                }
            }
      
        }
        return str;
    }
    static void findsubsequences(String str){
               String subStr="";
          for (int i = 0; i < str.length(); i++) {
              subStr="";
        for (int j = i; j < str.length(); j++) {
            subStr += str.charAt(j);
            list.add(subStr);
        }
          }
    }
     static int isPalindrome(String A) {
      int j=A.length()-1;
    int i=0;
    A=A.toLowerCase();
    while(i<j)
    {
       if(A.charAt(i)==A.charAt(j))
       {
           i++;
           j--;
       }
        else
            return 0;
    }
    return 1;
    */
  
}
