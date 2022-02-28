class Solution {
    public static int fact(int n){
        int m=0;
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        int ans=1;
        for(int i=n;i>=2;i--){
            ans=(ans*i)%1000003;
        }
        return ans;
    }
  public static int findRank(String A) {
      /* write your solution here */
      String s=A;
      int index=0;
      char []v =A.toCharArray();
      Arrays.sort(v);
      String str=new String(v);
      int total=0;
      int []check=new int[str.length()];
  
      for(int i=0;i<str.length();i++){
          if(check[i]==-1) continue;
          else if(s.charAt(index)==str.charAt(i)){
             check[i]=-1;
              index++;
              i=-1;
              }
          else{
             total=total+fact(str.length()-index-1);
          }
      }
      return (total+1)%1000003;
  }
}
