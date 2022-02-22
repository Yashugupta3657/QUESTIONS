class Solution {
    public int uniquePathsIII(int[][] grid) {
        int row=0;
        int col=0;
        int emptyc=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                   row=i;
                    col=j;
                }
                if(grid[i][j]==0){
                    emptyc++;
                }
            }
        }
        return unique(grid,row,col,emptyc);
    }
    public int unique(int[][] grid,int row,int col,int empty){
        if(row>grid.length-1||col>grid[0].length-1||col<0||row<0){
            return 0;
        }
        if(grid[row][col]==2){
            if(empty==0)             //we have to consider that path in which every empty cell is used
            return 1;
            else return 0;
        }
        if(grid[row][col]==-1){
            return 0;
        }
        int ov=grid[row][col];
        grid[row][col]=-1;   //otherwise it will go backward and stuck in endless loop
        if(ov==0){           
            empty--;
        }
         int b=unique(grid,row+1,col,empty);
         int c=unique(grid,row-1,col,empty);
        int d=unique(grid,row,col-1,empty);
        int a=unique(grid,row,col+1,empty);
        grid[row][col]=ov;         //so it wont change for next choices reversing change which we made
        if(ov==0)
        {
            empty++;
        }
        return a+b+c+d;
    }
}
