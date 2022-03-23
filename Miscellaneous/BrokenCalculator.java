//https://leetcode.com/problems/broken-calculator/submissions/
class Solution {
    public int brokenCalc(int startValue, int target) {
        int count=0;
        while(target>startValue){
            count++;
            if(target%2==0)
            {
                target/=2;
            }
            else{
                target+=1;
            }
        }
        count+=startValue-target;
        return count;
        // while(sum!=target){    //was not considering some cases
        //     if(sum==target){
        //         break;
        //     }
        //     else if(sum>target){
        //         sum-=1;
        //         count++;
        //     }
        //     else if(sum<target){
        //         sum*=2;
        //         count++;
        //     }
        // }
    }
}
