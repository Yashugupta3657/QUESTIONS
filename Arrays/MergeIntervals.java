//https://leetcode.com/problems/merge-intervals/
class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> merged=new LinkedList<>();
        for(int[] inter:intervals){
            if(merged.isEmpty()||merged.getLast()[1]<inter[0]){
                merged.add(inter);
            }
            else{
                merged.getLast()[1]=Math.max(merged.getLast()[1],inter[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
