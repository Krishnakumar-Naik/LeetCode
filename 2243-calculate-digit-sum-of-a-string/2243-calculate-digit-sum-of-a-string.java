class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            String ans="";
            for(int i=0;i<s.length();i+=k){
                String g=s.substring(i,Math.min(i+k,s.length()));
                int sum=0;
                for(int j=0;j<g.length();j++){
                    sum+=g.charAt(j)-'0';
                }
                ans+=sum;
            }
            s=ans;
            
        }
        return s;
    }
}