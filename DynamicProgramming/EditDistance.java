class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return sol(word1,word2,n,m,dp);
    }
    public int sol(String word1,String word2,int n,int m,int[][] dp){
        if(n==0&&m==0){
            return 0;
        }
        if(n==0)
        {
            return m;
        }
        if(m==0){
            return n;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }                         //three choices if char not equal - insert,replace,delete 
        if(word1.charAt(n-1)==word2.charAt(m-1)){
            return dp[n][m]=sol(word1,word2,n-1,m-1,dp);
        }
        else{
            int ins=sol(word1,word2,n,m-1,dp);
            int rep=sol(word1,word2,n-1,m-1,dp);
            int del=sol(word1,word2,n-1,m,dp);
             return dp[n][m]=Math.min(ins,Math.min(rep,del))+1;
        }
        
    }
}
