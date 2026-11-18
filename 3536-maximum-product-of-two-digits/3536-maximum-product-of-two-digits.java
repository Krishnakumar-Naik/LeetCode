class Solution {
    public int maxProduct(int n) {
        String m=Integer.toString(n);
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<m.length()-1;i++){
            for(int j=i+1;j<m.length();j++){
                int a=m.charAt(i)-'0';
                int b=m.charAt(j)-'0';
                if(a*b>mx) mx=a*b;
            }
        }
        return mx;
    }
}