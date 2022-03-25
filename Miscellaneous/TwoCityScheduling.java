//https://leetcode.com/problems/two-city-scheduling/submissions/
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->{
            return (a[0]-a[1])-(b[0]-b[1]);
        });
        int total=0;
       for(int i=0;i<costs.length/2;i++){
           total+=costs[i][0];
       }
        for(int j=costs.length/2;j<costs.length;j++){
            total+=costs[j][1];
        }
        
        return total;
    }
}
