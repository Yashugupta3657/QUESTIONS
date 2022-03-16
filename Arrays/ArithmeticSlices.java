class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int dp[]=new int[nums.length];
        for(int i=2;i<nums.length;i++){
             if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                 dp[i]=dp[i-1]+1;
             }
            else dp[i]=0;
        }
        int ans=0;
        for(int i=0;i<dp.length;i++)
            ans+=dp[i];
        return ans;
    }
}
