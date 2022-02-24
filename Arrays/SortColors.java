class Solution {
    public void sortColors(int[] nums) {
        int count2=0;
        int count1=0;
        int count0=0;
            
        for(int i=0;i<nums.length;i++){
            if(nums[i]==2){
                count2++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else{
                count0++;
            }
        }
        int i=0;
      for( i=0;i<nums.length&&count0>0;i++){
          nums[i]=0;
          count0--;
      }
          for(;i<nums.length&&count1>0;i++){
          nums[i]=1;
              count1--;
      }
          for(;i<nums.length&&count2>0;i++){
          nums[i]=2;
              count2--;
      }
    }
}
