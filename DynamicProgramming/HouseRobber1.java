class Solution {
    public int rob(int[] nums) {
        int cache[]=new int[nums.length+1];
        Arrays.fill(cache,-1);
        int max=checkmax(nums,nums.length-1,cache);
        return max;
    }
    public int checkmax(int[] nums,int n,int[] cache){
        if(n<0){
            return 0;
        }
        int max=0;
            int value1=0,value2=0;
              if(cache[n]!=-1){
              return cache[n];
            }
            value1=checkmax(nums,n-2,cache)+nums[n];
            value2=checkmax(nums,n-1,cache);
            max=Math.max(value1,value2);
            return cache[n]=max;
    }
}
