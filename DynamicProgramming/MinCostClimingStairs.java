class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int first=call(cost,0,dp);
        int second=call(cost,1,dp);
        return Math.min(first,second);
    }
    public int call(int[] cost,int n,int[] dp){
        if(n>=cost.length){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int a=call(cost,n+1,dp);
        int b=call(cost,n+2,dp);
        int c=Math.min(a,b)+cost[n];
        return dp[n]=c;
    }
}
