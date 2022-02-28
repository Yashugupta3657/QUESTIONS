import java.util.*;
class Main{
    public static ArrayList<Integer> A=new ArrayList<Integer>();
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
      for(int i=0;i<a;i++){
          int b=scan.nextInt();
          A.clear();
          if(b==0||b==1||b==2||b==3){
              System.out.println(0);
              continue;
          }
          sieveOfEratosthenes(b);
          int s=0,count=0;
          for(int k=1;k<A.size();k++){
              s=0;
              for(int l=0;l<A.size();l++){
                  s=s+A.get(l);
                   if(A.get(k)==s){
                       count++;
                   }
              }
          }
          System.out.println(count);
      }
   }
    public static void sieveOfEratosthenes(int n){
        boolean prime[]=new boolean[n+1];
        for(int i=0;i<=n;i++){
            prime[i]=true;
        }
        for(int p=2;p*p<=n;p++){
            if(prime[p]==true){
                for(int i=p*p;i<=n;i+=p){
                    prime[i]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==true)
                A.add(i);
        }
    }
}
