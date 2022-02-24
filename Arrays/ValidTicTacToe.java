class Solution {
    public boolean validTicTacToe(String[] board) {
        char[] arr=new char[9];
        int countx=0;
        int counto=0;
        int counte=0;
        boolean xwon=false;
        boolean owon=false;
        int k=0;
      for(int i=0;i<board.length;i++){  //rows check
          if(board[i].equals("XXX")){
              xwon=true;
          }
          if(board[i].equals("OOO")){
              owon=true;
          }
          for(int j=0;j<3;j++)
          {
              if(board[i].charAt(j)=='X'){
                  countx++;
              }
              else if(board[i].charAt(j)=='O') counto++;
              else counte++;
                     arr[k++]=board[i].charAt(j);
          }
      }
        for(int i=0;i<3;i++){   //column
            if(board[0].charAt(i)==board[1].charAt(i)&&board[1].charAt(i)==board[2].charAt(i)){
                if(board[0].charAt(i)=='X') xwon=true;
                if(board[0].charAt(i)=='O') owon=true;
            }
        }
        if(arr[0]==arr[4]&&arr[4]==arr[8])      //diagonals
        {
                if(arr[0]=='X') xwon=true;
                if(arr[0]=='O') owon=true;            
        }
        if(arr[2]==arr[4]&&arr[4]==arr[6])      //diagonals
        {
                if(arr[2]=='X') xwon=true;
                if(arr[2]=='O') owon=true;            
        }
        if(counto>countx){
           return false;
        } 
        int diff = countx - counto; 
        if (diff < 0 || diff > 1) return false;
        if(xwon&&owon||xwon&&(countx==counto)){
            return false;
        }
        if(countx-1>counto){
            return false;
        }
        if(xwon&&diff!=1) return false;
        if(owon&&diff!=0) return false;
        return true;
    }
}
