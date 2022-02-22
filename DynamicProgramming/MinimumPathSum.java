class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length+1][grid[0].length+1];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
      return  path(grid,0,0,dp);
    }
    public int path(int[][] grid,int row,int col,int[][] dp){
        if(row>grid.length-1||col>grid[0].length-1){
            return Integer.MAX_VALUE;
        }
        if(row==grid.length-1&&col==grid[0].length-1){
            return grid[row][col];
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int a=path(grid,row,col+1,dp);
        int b=path(grid,row+1,col,dp);
        return dp[row][col]=Math.min(a,b)+grid[row][col];
    }
}
