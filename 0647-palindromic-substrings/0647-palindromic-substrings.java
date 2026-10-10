class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String k=s.substring(i,j+1);
                StringBuilder m=new StringBuilder(k);
                if(k.equals(m.reverse().toString())){
                    c++;
                }
            }
        }
        return c;
    }
}