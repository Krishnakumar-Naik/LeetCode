class Solution {
    public long countCommas(long n) {
        long res=0;

        if(n>=1000){
            long k=Math.min(n,999999);
            res+=(k-1000)+1;
        }
        if(n>=1000000){
            long k=Math.min(n,999999999);
            res+=((k-1000000)+1)*2;
        }
        if(n>=1000000000){
            long k=Math.min(n,999999999999L);
            res+=((k-1000000000)+1)*3;
        }
        if(n>=1000000000000L){
            long k=Math.min(n,999999999999999L);
            res+=((k-1000000000000L)+1)*4;
        }
        if(n==1000000000000000L){
            res+=5;
        }
        return res;
    }
}