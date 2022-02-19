public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0;i<n;i++){
                      if(ispalin(a[i])==false){
                          return 0;
                      }
                  }
                  return 1;
           }
           public static boolean ispalin(int n){
               String str=Integer.toString(n);
               int i=0,j=str.length()-1;
               while(i<j){
                   if(str.charAt(i)==str.charAt(j))
                   {
                       i++;
                       j--;
                   }
                   else return false;
               }
               return true;
           }
