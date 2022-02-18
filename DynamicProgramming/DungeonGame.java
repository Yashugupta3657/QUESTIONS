class Solution {
    public int calculateMinimumHP(int[][] dungeon){
        int dp[][]=new int[dungeon.length+1][dungeon[0].length+1];
        int c=call(dungeon,0,0,dp);
      return c;
    }
    public int call(int[][] dungeon,int row,int col,int[][] dp){
        if(row==dungeon.length-1&&col==dungeon[0].length-1){
               if(dungeon[row][col]>=0){
                return 1;
            }
            else{
                return Math.abs(dungeon[row][col])+1;
            }
        }
        if(row>dungeon.length-1||col>dungeon[0].length-1){
            return Integer.MAX_VALUE;
        }
        if(dp[row][col]!=0)
            return dp[row][col];
        int a=call(dungeon,row+1,col,dp);
        int b=call(dungeon,row,col+1,dp);
        int ansI= Math.min(a,b)-dungeon[row][col];
        return dp[row][col]=ansI>0?ansI:1;
    }
}
