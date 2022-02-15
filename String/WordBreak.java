class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        HashSet<String> sety=new HashSet<String>();
        for(int i=0;i<B.size();i++){
            sety.add(B.get(i));
        }
        if(possible(A,sety)){
            return 1;
        }
        else return 0;
    }
    public static boolean possible(String A,HashSet<String> m){
        if(A.length()==0){
            return true;
        }
        for(int i=1;i<=A.length();i++){
            if(m.contains(A.substring(0,i))){
                if(possible(A.substring(i,A.length()),m)){
                    return true;
                }
            }
        }
        return false;
    }
}
