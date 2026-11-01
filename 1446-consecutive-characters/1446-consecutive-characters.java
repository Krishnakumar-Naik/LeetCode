class Solution {
    public int maxPower(String s) {
        int mx=1;int c=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
                if(c>mx){
                    mx=c;
                }
            }else{
                c=1;
            }
        }
        return mx;
    }
}