class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else if(s.charAt(i)!=t.charAt(j)){
                j++;
            }
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
}
/*
class Solution {
    HashSet<String> m=new HashSet<>();
    public boolean isSubsequence(String s, String t) {
        check(t,"");
       if(m.contains(s))
            return true;
        return false;
    }
    public void check(String given,String ans){
        if(given.length()==0){
            m.add(ans);
            return;
        }
        check(given.substring(1),ans+given.charAt(0));
        check(given.substring(1),ans);
    }
}
*/
