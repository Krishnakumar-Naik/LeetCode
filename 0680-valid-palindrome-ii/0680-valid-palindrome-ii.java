class Solution {
    public boolean validPalindrome(String s) {
        int st=0;
        int ed=s.length()-1;
        while(st<ed){
            if(s.charAt(st)!=s.charAt(ed)){
                return check(s,st+1,ed) || check(s,st,ed-1);
            }
            st++;
            ed--;
        }
        return true;
    }
    public boolean check(String s,int st,int ed){
        while(st<ed){
            if(s.charAt(st)!=s.charAt(ed)){
                return false;
            }
            st++;
            ed--;
        }
        return true;
    }
}