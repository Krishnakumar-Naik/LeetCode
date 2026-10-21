class Solution {
    public int residuePrefixes(String s) {
        int max=0;
        HashSet<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
            if(st.size()==(i+1)%3){
                max++;
            }
        }
        return max;
    }
}