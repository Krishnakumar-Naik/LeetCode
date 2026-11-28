class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s2="";
        for(char c:s.toCharArray()){
            int asc=(int) c;
            if((asc>=97 && asc<=122) || (asc<=57 && asc>=48)){
                s2+=c;
            }     
        }
        String rev="";
        for(int i=s2.length()-1;i>=0;i--){
            rev+=s2.charAt(i);
        }
        if(rev.equals(s2)){
            return true;
        }
        return false;

    }
}