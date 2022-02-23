class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length+1][2];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }
        return sol(prices,0,1,1,dp);
    }
    public int sol(int[] prices,int index,int b,int t,int[][] dp){
            if(t==0||index==prices.length){
                return 0;
            }
        if(dp[index][b]!=-1){
            return dp[index][b];
        }
            if(b==1){
                int c1=sol(prices,index+1,0,t,dp)-prices[index];
                int c2=sol(prices,index+1,b,t,dp);
                return dp[index][b]=Math.max(c1,c2);
            }
            else{
                int c1=sol(prices,index+1,0,t-1,dp)+prices[index];
                int c2=sol(prices,index+1,b,t,dp);
                return dp[index][b]=Math.max(c1,c2);
            }
        }
    }
