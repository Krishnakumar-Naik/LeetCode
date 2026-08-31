class Solution {
    public int hammingWeight(int n) {
        String st=Integer.toBinaryString(n);
        int ans=0;
        for(int i=0;i<st.length();i++){
            ans+=st.charAt(i)-'0';
        }
        return ans;
    }
}