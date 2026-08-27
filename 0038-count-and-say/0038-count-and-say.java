class Solution {
    public String countAndSay(int n) {
        String ans="1";
        for(int i=2;i<=n;i++){
            StringBuilder sb=new StringBuilder();
            int j=0;
            while(j<ans.length()){
                char ch=ans.charAt(j);
                int c=0;
                while(j<ans.length() && ans.charAt(j)==ch){
                    c++;
                    j++;
                }
                sb.append(c);
                sb.append(ch);
            }
            ans=sb.toString();
        }
        return ans;
    }
}