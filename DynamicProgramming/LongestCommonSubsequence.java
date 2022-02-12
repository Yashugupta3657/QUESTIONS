class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] cache=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            Arrays.fill(cache[i],-1);
        }
       return Commonsequence(text1,text2,0,0,cache);
    }
    public int Commonsequence(String S,String T,int cs,int ct,int[][] cache){
        if(cs==S.length()||ct==T.length()){
            return 0;
        }
         if(S.charAt(cs)==T.charAt(ct)){
            return Commonsequence(S,T,cs+1,ct+1,cache)+1;
         }
       if(cache[cs][ct]!=-1){
            return cache[cs][ct];
        }
        else{
        int count1=Commonsequence(S,T,cs+1,ct,cache);
        int count2=Commonsequence(S,T,cs,ct+1,cache);
        return cache[cs][ct]=Math.max(count1,count2);
        }
    }
}
