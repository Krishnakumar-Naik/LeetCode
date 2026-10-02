class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        int flag=1;
        if(i<n && s.charAt(i)=='-'){
            flag=-1;i++;
        }else if(i<n && s.charAt(i)=='+'){
            i++;
        }

        int ans=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int dig=s.charAt(i)-'0';
            if(ans>(Integer.MAX_VALUE-dig)/10){
                if(flag==1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }
            ans=ans*10+dig;
            i++;
        }
        return ans*flag;
    }
}