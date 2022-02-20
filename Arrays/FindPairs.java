class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count=0;
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }
            else
            m.put(arr[i],1);
        }
        for(int i=0;i<n;i++){
            if(m.containsKey(k-arr[i])){
                count+=m.get(k-arr[i]);
            }
            if(k-arr[i]==arr[i]){
                count--;
            }
        }
        return count/2;
    }
}
