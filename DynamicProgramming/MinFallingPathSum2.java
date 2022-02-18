class Solution {
    public int minFallingPathSum(int[][] grid) {
        int min=Integer.MAX_VALUE;
       int dp[][]=new int[grid.length+1][grid.length+1];
        for(int j=0;j<grid.length;j++)
            Arrays.fill(dp[j],-1);
        for(int i=0;i<grid.length;i++){
            min=Math.min(min,call(grid,0,i,dp));
        }
        return min;
    }
    public int call(int[][]grid,int row,int col,int[][]dp){
        if(col>grid.length-1){
            return Integer.MAX_VALUE;
        }
        if(row==grid.length-1){
            return grid[row][col];
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<grid.length;i++){
            if(i!=col)
            ans=Math.min(ans,call(grid,row+1,i,dp));
        }
        return dp[row][col]=ans+grid[row][col];
    }
}
