    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                count++;
            }
        }
        if(count==0){
            return 0;
        }
         int countn=0;
         int mincount=Integer.MAX_VALUE;
        for(int i=0;i<=n-count;i++){
            countn=0;
            for(int j=i;j<i+count;j++){
               if(arr[j]>k){
                   countn++;
               }
            }
           mincount= Math.min(countn,mincount);
        }
        return mincount;
    }
