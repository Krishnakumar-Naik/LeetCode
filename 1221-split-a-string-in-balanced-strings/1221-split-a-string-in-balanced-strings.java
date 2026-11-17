class Solution {
    public int balancedStringSplit(String s) {
        int c=0,r=0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') r++;
            else if(s.charAt(i)=='L') l++;
            if(r==l){
                c++;
                r=0;
                l=0;
            }
        }
        return c;
    }
}