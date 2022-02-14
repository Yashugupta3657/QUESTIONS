class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ind=new ArrayList<Integer>();
        Deque<Integer> m=new ArrayDeque<>();
        m.addLast(0);
        if(n==1){
             ind.add(arr[0]);
             return ind;
        }
        if(k==1){
        for(int i=0;i<n;i++){
            ind.add(arr[i]);
        }
        return ind;
        }
        for(int i=1;i<n;i++){
         
            while(!m.isEmpty()&&arr[m.getLast()]<=arr[i]){
                m.removeLast();
            }
             m.addLast(i);
            if(m.getFirst()==i-k){
                m.removeFirst();
            }
            if(i>=k-1){
               ind.add(arr[m.getFirst()]); 
            }
        }
        return ind;
    }
}
