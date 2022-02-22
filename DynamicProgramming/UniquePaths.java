class Solution {
    public int uniquePaths(int m, int n) {
        int matrix[][]=new int[m][n];
        int cache[][]=new int[m+1][n+1];
        for(int[] rows:cache){
            Arrays.fill(rows,-1);
        }
        int b=unique(matrix,0,0,cache);
        return b;
    } 
    public int unique(int matrix[][],int row ,int col,int[][] dp){
        if(row==matrix.length-1&&col==matrix[0].length-1)
        {
            return 1;
        }
        if(row>matrix.length-1||col>matrix[0].length-1){
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
