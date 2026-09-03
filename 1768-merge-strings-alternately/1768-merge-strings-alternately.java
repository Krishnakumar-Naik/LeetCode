class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";

        int flag=1; int i=0,j=0;
        while(i<=word1.length()-1 && j<=word2.length()-1){
            if(flag==1){
                ans+=word1.charAt(i);
                i++; flag=0;
            }else{
                ans+=word2.charAt(j);
                j++;flag=1;
            }
        }
        while(i<=word1.length()-1){
            ans+=word1.charAt(i); i++;
        }
        while(j<=word2.length()-1){
            ans+=word2.charAt(j); j++;
        }
        return ans;

    }
}