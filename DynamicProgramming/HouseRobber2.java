class Solution {
    public int rob(int[] nums) {
        int dp[][]=new int[nums.length+1][2];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }
        return check(nums,nums.length-1,0,dp);
    }
    public int check(int[] nums,int n,int flag,int[][] dp){
        if(n<0){
            return 0;
        }
        int val=0;
        int val1=0;
        if(dp[n][flag]!=-1){
            return dp[n][flag];
        }
        if(n==nums.length-1){
            val=nums[n]+check(nums,n-2,1,dp);
        }
        else if(n==0){
            if(flag==0)
            {
                val=nums[n]+check(nums,n-2,flag,dp);
            }
        }
        else{
            val=nums[n]+check(nums,n-2,flag,dp);
        }
        val1=check(nums,n-1,flag,dp);
        return dp[n][flag]=Math.max(val,val1);
    }
}
