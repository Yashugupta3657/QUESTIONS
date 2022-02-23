class Solution {
    public int maxProfit(int[] prices) {
        int dp[][][]=new int[prices.length+1][2][3];
        for(int i=0;i<dp.length;i++){
            dp[i][0][0]=-1;
            dp[i][0][1]=-1;
            dp[i][0][2]=-1;
            dp[i][1][0]=-1;
            dp[i][1][1]=-1;
            dp[i][1][2]=-1;
        }
        return sol(prices,0,1,2,dp); //number of transactions given is 2
    }
    public int sol(int[] prices,int index,int b,int t,int[][][] dp){
        if(t==0||index==prices.length)
        {
            return 0;
        }
        if(dp[index][b][t]!=-1){
            return dp[index][b][t];
        }
        if(b==1){
            int c1=sol(prices,index+1,0,t,dp)-prices[index];
            int c2=sol(prices,index+1,b,t,dp);
            return dp[index][b][t]=Math.max(c1,c2);
        }
        else{
            int c1=sol(prices,index+1,1,t-1,dp)+prices[index];
            int c2=sol(prices,index+1,b,t,dp); 
            return dp[index][b][t]=Math.max(c1,c2);
        }
    }
}
