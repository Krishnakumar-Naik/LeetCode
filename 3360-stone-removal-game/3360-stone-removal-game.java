class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        boolean ans=false;
        int c=10;
        while(n>=c){
            if(c%2==0){
                ans=true;
                n-=c;
                c--;
            }else{
                ans=false;
                n-=c;
                c--;
            }
        }
        return ans;
    }
}