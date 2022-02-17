class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> m=new ArrayList<>();
       for(int i=0;i<=rowIndex;i++){
           List<Integer> row=new ArrayList<Integer>();
           for(int j=0;j<=i;j++){
               if(j==0||j==i){
                   row.add(1);
               }
               else{
                   row.add(m.get(i-1).get(j-1)+m.get(i-1).get(j));
               }
           }
           m.add(row);
       }
        return m.get(rowIndex);
    }
}


