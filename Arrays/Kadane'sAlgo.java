class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(maxsum<currsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
    
}
