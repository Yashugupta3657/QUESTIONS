class Solution {
    public static boolean isPalindrome(String A) {
      /* write your solution here */
      String str=A.toLowerCase();
      String str1="";
      String str2="";
      if(A.length()==0||A.length()==1||A.length()==2){
          return true;
      }
      for(int i=0;i<str.length();i++){
          if(Character.isLetterOrDigit(str.charAt(i))){
              str1+=str.charAt(i);
          }
      }
         for(int i=str.length()-1;i>=0;i--){
          if(Character.isLetterOrDigit(str.charAt(i))){
              str2+=str.charAt(i);
          }
      }
      if(str1.equals(str2)){
          return true;
      }
     
      return false;
  }
  public static int solve(String A) {
      /* write your solution here */
      int count=0;
      if(isPalindrome(A)){
          return count;
      }
      int i=A.length()/2-1;
      int j=A.length()/2-1;
   
      while(i>=j&&i<A.length()&&j>=0){
          if(A.charAt(i)==A.charAt(j)){
              i++;
              j--;
          }
          else if(A.charAt(i)!=A.charAt(j)){
              count=count+A.length()-i+j+1;
              return count;
          }
          else{
              count++;
              i++;
              j--;
          }
      }
      while(i<A.length()){
          count++;
          i++;
      }
      while(j>=0){
          j--;
          count++;
      }
      return count;
  }
}
