class Solution {
    public int numDistinct(String s, String t) {
        int[][] cache=new int[s.length()+1][t.length()+1];
        for(int[] rows:cache){
            Arrays.fill(rows,-1);
        }
        return subsequence(s,t,0,0,cache);
    }
     int subsequence(String S,String T,int n,int m,int[][] cache){
        if(m==T.length()){
            return 1;
        }
        if(n==S.length()){
            return 0;
        }
        if(cache[n][m]!=-1){
            return cache[n][m];
        }
        int add=0;
        if(S.charAt(n)==T.charAt(m)){
             add=subsequence(S,T,n+1,m+1,cache);
        }
        int exc=subsequence(S,T,n+1,m,cache);
        return cache[n][m]=add+exc;
    }
}
