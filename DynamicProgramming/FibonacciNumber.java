class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int a=call(n,dp);
        return a;
    }
    public int call(int n,int[]dp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
         if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=call(n-1,dp)+call(n-2,dp);
    }
}
