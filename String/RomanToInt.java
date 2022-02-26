class Solution {
  public static int romanToInt(String A) {
      /* write your solution here */
      //IV//IX//XL
      HashMap<Character,Integer> check=new HashMap<Character,Integer>();
      check.put('I',1);
      check.put('V',5);
      check.put('X',10);
      check.put('L',50);
      check.put('C',100);
      check.put('D',500);
      check.put('M',1000);
      int sum=0;
      for(int i=A.length()-1;i>0;i--){
          char a=A.charAt(i);
          char b=A.charAt(i-1);
          if(check.get(a)>check.get(b)){
              sum=sum-check.get(b)+check.get(a);
          } 
          else if(check.get(a)<=check.get(b)){
              sum=sum+check.get(b)+check.get(a);
          }
      }
      return sum;
  }
}
