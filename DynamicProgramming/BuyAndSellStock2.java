class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length+1][2];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }
        return sol(prices,0,1,dp);
    }
 /*No limit of transactions*/
    public int sol(int[] prices,int index,int b,int[][] dp){
        if(index==prices.length){
            return 0;
        }
        if(dp[index][b]!=-1){
            return dp[index][b];
        }
        if(b==1){
            int c1=sol(prices,index+1,0,dp)-prices[index];  //buy kiaa
            int c2=sol(prices,index+1,b,dp);                  //buy nhi kia next choice
            return dp[index][b]=Math.max(c1,c2);
        }
        else{
           int c3=sol(prices,index+1,1,dp)+prices[index];      //sell kia
           int c4=sol(prices,index+1,b,dp);                        //sell nhi kia next choice
            return dp[index][b]=Math.max(c3,c4);
        }
    }
}
