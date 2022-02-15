class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
          for(int i=1;i<strs.length;i++){
              prefix=commn(prefix,strs[i]);
          }
        return prefix;
    }
    String commn(String a,String b){
        String result="";
        for(int i=0;i<a.length()&&i<b.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                result+=a.charAt(i);
            }
            else break;
        }
        return result;
    }
}
