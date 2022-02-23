class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][][] dp=new int[prices.length+1][2][k+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<2;j++)
                for(int g=0;g<k+1;g++)
                    dp[i][j][g]=-1;
        return sol(prices,0,1,k,dp);
    }
  //k is number of transactions already given we can do
    public int sol(int[] prices,int index,int b,int k,int[][][] dp){
        if(k==0||index==prices.length)
        {
            return 0;
        }
        if(dp[index][b][k]!=-1){
            return dp[index][b][k];
        }
        if(b==1){
            int c1=sol(prices,index+1,0,k,dp)-prices[index];
            int c2=sol(prices,index+1,b,k,dp);
            return dp[index][b][k]=Math.max(c1,c2);
        }
        else{
            int c1=sol(prices,index+1,1,k-1,dp)+prices[index];
            int c2=sol(prices,index+1,b,k,dp);
            return dp[index][b][k]=Math.max(c1,c2);
        }
    }
}
