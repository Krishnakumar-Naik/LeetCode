class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack();
        st.push(0);
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(0);
            }else{
                int t=st.pop();
                int a=Math.max(2*t,1);
                int b=st.pop();
                st.push(a+b);              
            }
        }
        return st.pop();
    }
}