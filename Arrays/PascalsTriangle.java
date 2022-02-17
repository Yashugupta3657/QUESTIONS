class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> m=new ArrayList<>();
        if(numRows==0){
            return m;
        }
        for(int i=1;i<=numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0||j==i-1){
                    row.add(1);
                }
                else{
                    row.add(m.get(i-2).get(j)+m.get(i-2).get(j-1));
                }
            }
            m.add(row);
        }
        return m;
    }
}
