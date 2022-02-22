class Solution {
            int m=(int)1000000007;
    public int numTilings(int n) {
        int dp[][]=new int[n+1][3];
        for(int[] rows:dp)
        Arrays.fill(rows,-1);
        return check(n,0,dp);
    }
    public int check(int n,int flag,int[][] dp){
        if(n==0&&flag==0){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int ways=0;
        if(dp[n][flag]!=-1){
            return dp[n][flag];
        }
        if(flag==0){        ///empty
            int a=check(n-1,0,dp);
            int b=check(n-2,0,dp);
            int c=check(n-1,1,dp);
            int d=check(n-1,2,dp);
            ways=((((a+b)%m)+c)%m+d)%m;
        }
        else if(flag==1){          ///upper filled initially
            ways+=check(n-2,0,dp);
            ways+=check(n-1,2,dp);
        }
        else{                     ///lower filled initially
            ways+=check(n-2,0,dp);
            ways+=check(n-1,1,dp);
            
        }
        return dp[n][flag]=ways%m;
    }
}
