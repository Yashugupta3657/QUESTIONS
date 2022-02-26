import java.util.*;
class Main
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
int tc=sc.nextInt();
        for(int t=1;t<=tc;++t){
            int n=sc.nextInt();
            int[] price = new int[n];
            for(int i=0;i<n;++i)price[i]=sc.nextInt();
            
            //process from right end 
            Stack<Integer> stk = new Stack<>();
            long cost=0;
                            int discount=0;
            for(int i=n-1;i>=0;i--){

                while(stk.size()>0 &&  price[i]<stk.peek() ){
                    stk.pop();
                }
                
                if(stk.size()==0){
                    discount=0;
                }else{
                    discount=stk.peek();
                }
                
                stk.push(price[i]);
                cost+=price[i]-discount;
                
            }
            System.out.println(cost);
        }
    }
}



