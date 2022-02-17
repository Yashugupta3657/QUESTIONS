class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        int dp[][]=new int[matrix.length+1][matrix.length+1];
        for(int i=0;i<=matrix.length;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<matrix.length;i++){
            int a=call(matrix,0,i,dp);
            if(min>a)
                min=a;
        }
     
        return min;
    }
    public int call(int[][] matrix,int row,int col,int[][] dp){
        if(col<0||col>matrix.length-1){    //because sq matrix
            return Integer.MAX_VALUE;
        }
     if(row==matrix.length-1){
            return matrix[row][col];
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int a=call(matrix,row+1,col-1,dp);
        int b=call(matrix,row+1,col,dp);
        int c=call(matrix,row+1,col+1,dp);
        int k=Math.min(a,b);
        return dp[row][col]=Math.min(k,c)+matrix[row][col];
    }
}
