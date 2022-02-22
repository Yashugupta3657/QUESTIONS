class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int dp[][]=new int[ob.length+1][ob[0].length+1];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
         return unique(ob,0,0,dp);
    }
   public int unique(int[][] matrix,int row,int col,int[][] dp){
      if(row==matrix.length-1&&col==matrix[0].length-1&&matrix[row][col]==0){
           return 1;
       }
     if(row>matrix.length-1||col>matrix[0].length-1){
           return 0;
       }
      if(matrix[row][col]==1){
           return 0;
       }
       if(dp[row][col]!=-1){
           return dp[row][col];
       }
        int a=unique(matrix,row,col+1,dp);
       int b=unique(matrix,row+1,col,dp);
       return dp[row][col]=a+b;
    }
}
