// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer> mp=new HashMap<String,Integer>();
        
        for(int i=0;i<N;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else
            mp.put(arr[i],1);
        }
        int max1=Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> m:mp.entrySet()){
            max1=Math.max(max1,m.getValue());
        }
        String ans="";
        int max2=Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> m:mp.entrySet()){
            if(max2<m.getValue()&&m.getValue()<max1){
                max2=m.getValue();
                ans=m.getKey();
            }
        }
        return ans;
    }
}
