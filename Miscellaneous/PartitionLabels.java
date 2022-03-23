//https://leetcode.com/problems/partition-labels/
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> m=new ArrayList<>();
        int []arr=new int[26];
      //store last position of each character
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        int count=0;
        int bound=0;
        for(int i=0;i<s.length();i++){
            bound=Math.max(bound,arr[s.charAt(i)-'a']);
            count++;
            if(bound==i){
                m.add(count);
                count=0;
            }
        }
        return m;
    }
}
