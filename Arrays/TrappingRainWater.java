class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        // Your code here
        // if(n>2){
        //     long out,total=0;
        //       int j=n-1;
        //       int k=0;
        //         while(arr[j-1]>=arr[j]){
        //             j--;
        //         }
        //         while(arr[k]<=arr[k+1]){
        //             k++;
        //         }
        //         out=Math.min(arr[j],arr[k]);
        //   for(int i=k+1;i<j;i++){
        //          if(arr[i]<out){
        //              total+=Math.abs(out-arr[i]);
        //          }
        //   }
        //   return total;
        // }
        // return (long)0;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(left[i],right[i])-arr[i];
        }
        return sum;
    }
}
