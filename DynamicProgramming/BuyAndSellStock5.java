class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length+1][2];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }
        return sol(prices,0,1,dp);
    }
    public int sol(int[] prices,int index,int b,int[][] dp){
      ///as we jump twice in index after selling we might go out of index
        if(index>=prices.length)
        {
            return 0;
        }
        if(dp[index][b]!=-1){
            return dp[index][b];
        }
        if(b==1){
            int c1=sol(prices,index+1,0,dp)-prices[index];
            int c2=sol(prices,index+1,b,dp);
            return dp[index][b]=Math.max(c1,c2);
        }
        else{
            int c1=sol(prices,index+2,1,dp)+prices[index];       //as we sell we have to cooldown for 1 day before buying so jump by 2 but we can buy on same day
            int c2=sol(prices,index+1,b,dp);
            return dp[index][b]=Math.max(c1,c2);
        }
    }
}
