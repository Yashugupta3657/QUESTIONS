import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Double> arr=new ArrayList<Double>();
        for(int i=0;i<n;i++){
             arr.add(sc.nextDouble());
        }
        Collections.sort(arr);
        int left = 0;
        int right = arr.size() - 1;
        int count = 0;
        while(left <= right){
            if(arr.get(left) + arr.get(right) <= 3.0){
                if(left==right){
                   arr.remove(right);
                    count++;
                   
                }
                else{
                 arr.remove(right);
                arr.remove(left);
                left=0;
                right=arr.size()-1;
                count++;
                }
            }
            else{
                arr.remove(right);
                right--;
                count++;
            }
        }
        System.out.println(count);
    }
}
//edyst
