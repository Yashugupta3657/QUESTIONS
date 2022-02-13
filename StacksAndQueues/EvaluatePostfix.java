class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        int result=0;
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='*'&&S.charAt(i)!='/'&&S.charAt(i)!='+'&&S.charAt(i)!='-'){
                String str=""+S.charAt(i);
                st.push(Integer.parseInt(str));
            }
            else{
                int a=st.pop();
                int b=st.pop();
                if(S.charAt(i)=='*')
                result=b*a;
                else if(S.charAt(i)=='/'){
                    result=b/a;
                }
                else if(S.charAt(i)=='+'){
                    result=b+a;
                }
                else{
                    result=b-a;
                }
                st.push(result);
            }
        }
        return st.pop();
    }
}
