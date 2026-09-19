class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int r=num;
        while(l<=r){
            int m=l+(r-l)/2;
            long s=(long)m*m;
            if(s==num){
                return true;
            }else if(s<num){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return false;
    }
}