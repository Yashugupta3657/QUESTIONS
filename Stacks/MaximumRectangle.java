class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ht[]=new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            ht[i]=matrix[0][i]-'0';
        }
        int max=area(ht);
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    ht[j]=ht[j]+1;
                }
                else{
                   ht[j]=0;
                }
            }
            if(max<area(ht)){
                max=area(ht);
            }
        }
        return max;
    }
    int area(int[] ht){
        int nse[]=Nse(ht);
        int pse[]=Pse(ht);
        int max=0;
        for(int i=0;i<ht.length;i++){
            if(max<=(ht[i]*(nse[i]-pse[i]-1))){
                max=(ht[i]*(nse[i]-pse[i]-1));
            }
        }
        return max;
    }
        public int[] Nse(int[] arr){
        Stack<Integer> m=new Stack<Integer>();
        m.push(0);
        int []nse=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            while(!m.isEmpty()&&arr[m.peek()]>arr[i]){
                nse[m.pop()]=i;
            }
            m.push(i);
        }
        while(!m.isEmpty()){
            nse[m.pop()]=arr.length;
        }
        return nse;
    }
    public int[] Pse(int[] arr){
        Stack<Integer> m=new Stack<Integer>();
        int []pse=new int[arr.length];
        m.push(0);
        pse[0]=-1;
        for(int i=1;i<arr.length;i++){
            while(!m.isEmpty()&&arr[m.peek()]>=arr[i]){
                m.pop();
            }
            if(!m.isEmpty()){
                pse[i]=m.peek();
            }
            else pse[i]=-1;
            m.push(i);
        }
        return pse;
    }
}
